# DSA Dashboard

A personal DSA (Data Structures & Algorithms) problem tracker built with FastAPI and vanilla JavaScript. Problems are written in Java with metadata embedded directly in the source file as structured comments. A parser extracts that metadata into JSON, which the dashboard reads and displays.

---

## Project Structure

```
DSA/
├── dashboard/
│   ├── templates/
│   │   └── index.html          # Dashboard UI
│   └── static/
│       └── style.css           # Styles
│
├── metadata/
│   └── problems.json           # Auto-generated — do not edit manually
│
├── src/
│   ├── Basics/
│   │   ├── Arrays/
│   │   ├── Strings/
│   │   ├── Sorting/
│   │   └── ...
│   └── Problems/
│       └── ...
│
├── tools/
│   ├── app.py                  # FastAPI server
│   ├── parser.py               # Extracts metadata from Java files → problems.json
│   └── migrate.py              # One-time migration to add @metadata-start / @metadata-end markers
│
├── .gitignore
└── README.md
```

---

## How It Works

### 1. Metadata in Java files

Each Java problem file contains a structured comment block that holds all metadata for that problem. The parser reads this block — nothing else.

```java
/**
 * @metadata-start
 *
 * @id           f05103ae-c399-4091-8f85-bc6e9e917e20
 * @name         BubbleSort
 * @description  Basic sorting algorithm which repeatedly steps through the list,
 *               compares adjacent elements and swaps them if they are in the wrong order.
 *
 * @topic        Sorting
 * @type         Algorithm
 * @difficulty   Easy
 * @pattern      Comparison
 *
 * @companies
 * @source
 * @url
 *
 * @status       Unsolved
 * @approach
 * @attempts     0
 * @confidence   Low
 * @review
 *
 * @time-complexity   O(N^2)
 * @space-complexity  O(1)
 *
 * @limitations
 * @edge-cases
 *
 * @metadata-end
 */
```

**Rules:**
- The block must start with `@metadata-start` and end with `@metadata-end`
- Every tag is `@key value` on its own line
- Tags can be left empty — the parser will store them as empty strings
- You can add any custom tag (e.g. `@revised-on`, `@resource`) — the dashboard will display it automatically under a "Custom" section in the detail panel
- `@companies` accepts comma-separated values: `@companies Google, Amazon, Meta`

### 2. Parser

The parser scans all `.java` files under `src/`, extracts the metadata block from each, and writes the result to `metadata/problems.json`.

- `section` and `category` are derived automatically from the folder path (e.g. `src/Basics/Sorting/` → section: `Basics`, category: `Sorting`)
- If `@id` is missing, a UUID is generated automatically
- Duplicate IDs are flagged as errors in the output

### 3. Dashboard

The FastAPI server serves `index.html` and exposes a `/problems` endpoint that returns `problems.json`. The dashboard fetches this on load and renders problem cards with filters for status, difficulty, and topic. Each card expands to show the full detail panel.

---

## Setup

### Prerequisites

- Python 3.10+
- Java files in `src/` with `@metadata-start` / `@metadata-end` blocks

### Install dependencies

```bash
# From the project root
python -m venv .venv
source .venv/bin/activate        # macOS / Linux
# .venv\Scripts\activate         # Windows

pip install fastapi uvicorn
```

---

## Commands

### Run the dashboard

```bash
# From the project root
uvicorn tools.app:app --reload
```

Then open [http://127.0.0.1:8000](http://127.0.0.1:8000) in your browser.

### Parse / refresh problems

Run this every time you add or update a problem's metadata:

```bash
python tools/parser.py
```

Output:
```
Problems indexed : 12
Metadata errors  : 0
Output           : /path/to/DSA/metadata/problems.json
```

If there are errors (missing required tags, duplicate IDs), they are listed below the summary.

### Migrate existing Java files

One-time command. Adds `@metadata-start` and `@metadata-end` markers to any Java file that has a DSA metadata block but is missing the markers:

```bash
python tools/migrate.py
```

Files that are already migrated are skipped. After running, re-run the parser:

```bash
python tools/parser.py
```

---

## Adding a New Problem

1. Create a `.java` file in the appropriate `src/` subfolder
2. Add the metadata block at the top of the file (copy the template above)
3. Fill in at minimum: `@id`, `@name`, `@status`
4. Run the parser:

```bash
python tools/parser.py
```

5. Refresh the dashboard — the new problem appears immediately (no server restart needed)

---

## Updating a Problem

1. Open the `.java` file
2. Edit the relevant `@tag` values inside the metadata block
3. Re-run the parser:

```bash
python tools/parser.py
```

4. Refresh the dashboard

---

## Required Tags

| Tag | Required | Notes |
|-----|----------|-------|
| `@id` | Yes | UUID — auto-generated if missing |
| `@name` | Yes | Display name on the dashboard |
| `@status` | Yes | `Unsolved` / `Solved` / `Revisiting` |
| `@type` | Yes | e.g. `Algorithm`, `Normal` |
| `@difficulty` | No | `Easy` / `Medium` / `Hard` |
| `@topic` | No | Used by the topic filter |
| `@pattern` | No | e.g. `Two Pointers`, `Sliding Window` |
| `@companies` | No | Comma-separated |
| `@time-complexity` | No | e.g. `O(N log N)` |
| `@space-complexity` | No | e.g. `O(1)` |

Any other `@tag` you add is stored and shown in the dashboard's detail panel automatically.

---

## Dashboard Features

| Feature | Description |
|---------|-------------|
| Search | Filter by problem name in real time |
| Status filter | Unsolved / Solved / Revisiting |
| Difficulty filter | Easy / Medium / Hard |
| Topic filter | Arrays, Sorting, Trees, etc. |
| Reset | Clears all filters at once |
| Stat chips | Live counts for total, solved, unsolved, revisiting |
| Expandable cards | Click `▸ details` on any card to see all fields |
| Custom tags | Any unknown `@tag` appears automatically in the detail panel |
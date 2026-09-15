from pathlib import Path
import re
import json
import uuid


ROOT = Path(__file__).resolve().parent.parent
SRC_DIR = ROOT / "src"
OUTPUT_FILE = ROOT / "metadata" / "problems.json"


REQUIRED_FIELDS = [
    "id",
    "name",
    "type",
    "status",
]


def find_java_files():
    return SRC_DIR.rglob("*.java")


def extract_metadata(file_path):
    content = file_path.read_text(encoding="utf-8")

    match = re.search(r"@metadata-start(.*?)@metadata-end", content, re.DOTALL)

    if not match:
        return None

    block = match.group(1)

    metadata = {}

    for line in block.splitlines():
        line = line.strip()

        if not line.startswith("* @"):
            continue

        line = line[2:].strip()

        key, _, value = line.partition(" ")

        key = key[1:]
        value = value.strip()

        metadata[key] = value

    # Generate UUID if missing
    if not metadata.get("id"):
        metadata["id"] = str(uuid.uuid4())

    # Derive location from folder structure
    relative_path = file_path.relative_to(ROOT)
    parts = relative_path.parts

    metadata["file"] = str(relative_path)

    if len(parts) >= 3:
        metadata["section"] = parts[1]

    if len(parts) >= 4:
        metadata["category"] = parts[2]

    # Convert comma-separated values into lists
    for field in ["companies"]:
        if field in metadata and metadata[field]:
            metadata[field] = [
                item.strip()
                for item in metadata[field].split(",")
                if item.strip()
            ]
        else:
            metadata[field] = []

    return metadata


def validate_metadata(metadata):
    errors = []

    for field in REQUIRED_FIELDS:
        if not metadata.get(field):
            errors.append(f"Missing @{field}")

    return errors


def main():
    problems = []
    errors = []
    ids = set()

    for file_path in find_java_files():

        metadata = extract_metadata(file_path)

        if not metadata:
            continue

        validation_errors = validate_metadata(metadata)

        if validation_errors:
            errors.append({
                "file": str(file_path.relative_to(ROOT)),
                "errors": validation_errors
            })

        problem_id = metadata["id"]

        if problem_id in ids:
            errors.append({
                "file": str(file_path.relative_to(ROOT)),
                "errors": [f"Duplicate ID: {problem_id}"]
            })

        ids.add(problem_id)

        problems.append(metadata)

    OUTPUT_FILE.parent.mkdir(exist_ok=True)

    OUTPUT_FILE.write_text(
        json.dumps(problems, indent=2),
        encoding="utf-8"
    )

    print(f"Problems indexed : {len(problems)}")
    print(f"Metadata errors  : {len(errors)}")
    print(f"Output           : {OUTPUT_FILE}")

    if errors:
        print("\nIssues found:")

        for error in errors:
            print(f"\n{error['file']}")

            for message in error["errors"]:
                print(f"  - {message}")


if __name__ == "__main__":
    main()
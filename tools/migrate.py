from pathlib import Path
import re
import uuid
import argparse


ROOT = Path(__file__).resolve().parent.parent
SRC_DIR = ROOT / "src"


def filename_to_name(file_path):
    name = file_path.stem
    name = name.replace("_", " ")
    name = re.sub(r"\s+", " ", name)
    return name.strip()


def get_location(file_path):
    relative = file_path.relative_to(SRC_DIR)
    parts = relative.parts

    section = parts[0] if len(parts) >= 1 else ""
    category = parts[1] if len(parts) >= 3 else ""

    return section, category


def has_metadata(content):
    return "@id" in content and "@name" in content


def build_metadata(file_path):
    section, category = get_location(file_path)
    name = filename_to_name(file_path)

    return f"""/**
 * @id {uuid.uuid4()}
 * @name {name}
 * @description
 *
 * @topic
 * @type Normal
 * @difficulty
 * @pattern
 *
 * @companies
 * @source
 * @url
 *
 * @status Unsolved
 * @approach
 * @attempts 0
 * @confidence Low
 * @review
 *
 * @time-complexity
 * @space-complexity
 *
 * @limitations
 * @edge-cases
 */
"""


def migrate_file(file_path, dry_run):
    content = file_path.read_text(encoding="utf-8")

    if has_metadata(content):
        return False

    metadata = build_metadata(file_path)

    package_match = re.search(r"^package\s+.*?;", content, re.MULTILINE)

    if package_match:
        insert_position = package_match.start()
        new_content = (
            content[:insert_position]
            + metadata
            + "\n"
            + content[insert_position:]
        )
    else:
        new_content = metadata + "\n" + content

    if not dry_run:
        file_path.write_text(new_content, encoding="utf-8")

    print(f"{'[DRY RUN] ' if dry_run else ''}Would update: {file_path.relative_to(ROOT)}")

    return True


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument(
        "--dry-run",
        action="store_true",
        help="Show changes without modifying files"
    )

    args = parser.parse_args()

    files = list(SRC_DIR.rglob("*.java"))

    updated = 0
    skipped = 0

    for file_path in files:
        if migrate_file(file_path, args.dry_run):
            updated += 1
        else:
            skipped += 1

    print()
    print(f"Java files found : {len(files)}")
    print(f"Files to update  : {updated}")
    print(f"Files skipped     : {skipped}")


if __name__ == "__main__":
    main()
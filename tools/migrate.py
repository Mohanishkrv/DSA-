from pathlib import Path
import re

ROOT = Path(__file__).resolve().parent.parent
SRC_DIR = ROOT / "src"

def migrate_file(file_path):
    content = file_path.read_text(encoding="utf-8")

    # Already migrated
    if "@metadata-start" in content:
        print(f"  SKIP  {file_path.name}")
        return

    match = re.search(r"(/\*\*)(.*?)(\*/)", content, re.DOTALL)
    if not match or "@id" not in match.group(2):
        print(f"  SKIP  {file_path.name} (no DSA block)")
        return

    old_block = match.group(0)
    inner     = match.group(2)

    new_block = f"/**\n * @metadata-start{inner} * @metadata-end\n */"

    new_content = content.replace(old_block, new_block, 1)
    file_path.write_text(new_content, encoding="utf-8")
    print(f"  DONE  {file_path.name}")

def main():
    files = list(SRC_DIR.rglob("*.java"))
    print(f"Migrating {len(files)} Java files...\n")
    for f in files:
        migrate_file(f)
    print("\nDone. Re-run parser.py to rebuild problems.json.")

if __name__ == "__main__":
    main()
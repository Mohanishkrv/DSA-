from pathlib import Path
import json

from fastapi import FastAPI
from fastapi.responses import HTMLResponse
from fastapi.staticfiles import StaticFiles  # add this


app = FastAPI()

ROOT = Path(__file__).resolve().parent.parent
PROBLEMS_FILE = ROOT / "metadata" / "problems.json"
HTML_FILE = ROOT / "dashboard" / "templates" / "index.html"

app.mount("/static", StaticFiles(directory=ROOT / "dashboard" / "static"), name="static")  # add this


@app.get("/", response_class=HTMLResponse)
def home():
    return HTML_FILE.read_text(encoding="utf-8")


@app.get("/problems")
def get_problems():
    with open(PROBLEMS_FILE, "r", encoding="utf-8") as file:
        problems = json.load(file)

    return problems
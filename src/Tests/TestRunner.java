package Tests;

public abstract class TestRunner {

    private int passed = 0;
    private int failed = 0;
    private StringBuilder failures = new StringBuilder();

    public abstract void runTests();

    // Single generic check — everything comes in as String
    protected void check(String label, String actual, String expected) {
        if (actual != null && actual.equals(expected)) {
            passed++;
        } else {
            failed++;
            failures.append("  FAIL: ").append(label)
                    .append(" → expected \"").append(expected)
                    .append("\", got \"").append(actual).append("\"\n");
        }
    }

    // ── Converters — call these when passing results into check() ──

    protected String str(boolean v)  { return String.valueOf(v); }
    protected String str(int v)      { return String.valueOf(v); }
    protected String str(double v)   { return String.valueOf(v); }
    protected String str(int[] v)    { return java.util.Arrays.toString(v); }
    protected String str(String v)   { return v; }

    // For 2D arrays (grids, matrices, graphs as adjacency)
    protected String str(int[][] v)  { return java.util.Arrays.deepToString(v); }

    // For lists (BFS/DFS traversal order, paths)
    protected String str(java.util.List<?> v) { return v.toString(); }

    protected void printSummary() {
        System.out.println("Passed: " + passed + " | Failed: " + failed);
        if (failed > 0) System.out.print(failures);
    }
}
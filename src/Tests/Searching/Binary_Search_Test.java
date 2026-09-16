package Tests.Searching;

import Tests.TestRunner;
import Searching.Binary_Search;

class Binary_Search_Test extends TestRunner {

    // Happy path
    int[] scenario1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    // Edge case — single element
    int[] scenario2 = {7};

    // Negative — target not in array
    int[] scenario3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Override
    public void runTests() {
        check("Happy path — found middle",   str(Binary_Search.iterativeSearch(scenario1, 5)),  "true");
        check("Happy path — first element",  str(Binary_Search.iterativeSearch(scenario1, 1)),  "true");
        check("Happy path — last element",   str(Binary_Search.iterativeSearch(scenario1, 10)), "true");
        check("Edge case — single element",  str(Binary_Search.iterativeSearch(scenario2, 7)),  "true");
        check("Negative — out of range",     str(Binary_Search.iterativeSearch(scenario3, 11)), "false");
        check("Negative — target not found", str(Binary_Search.iterativeSearch(scenario3, 0)),  "false");

        printSummary();
    }

    public static void main(String[] args) {
        new Binary_Search_Test().runTests();
    }
}
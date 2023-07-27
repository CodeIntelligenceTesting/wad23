package com.example;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class SimpleChecksTests {

    @Test
    public void firstUnitTest() {
        ExploreMe ex = new ExploreMe(2);
        assertDoesNotThrow(() -> ex.exploreSimpleChecks(0, "Developer"));
    }

    @Test
    public void secondUnitTest() {
        ExploreMe ex = new ExploreMe(-2);
        assertDoesNotThrow(() -> ex.exploreSimpleChecks(100, "Maintainer"));
    }

    @FuzzTest
    void myFuzzTest(FuzzedDataProvider data) {
        int a = data.consumeInt();
        int b = data.consumeInt();
        String c = data.consumeRemainingAsString();

        ExploreMe ex = new ExploreMe(a);
        ex.exploreSimpleChecks(b, c);
    }

}

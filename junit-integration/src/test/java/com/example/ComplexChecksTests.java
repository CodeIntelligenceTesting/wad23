package com.example;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ComplexChecksTests {

    @Test
    public void firstUnitTest() {
        assertDoesNotThrow(() -> ExploreMe.exploreComplexChecks(0, 0, "".getBytes()));
    }

    @Test
    public void secondUnitTest() {
        assertDoesNotThrow(() -> ExploreMe.exploreComplexChecks(100, 200, "WAD32".getBytes()));
    }

    @FuzzTest
    void myFuzzTest(FuzzedDataProvider data) {
        ExploreMe.exploreComplexChecks(
                data.consumeLong(),
                data.consumeLong(),
                data.consumeRemainingAsBytes()
        );
    }

}

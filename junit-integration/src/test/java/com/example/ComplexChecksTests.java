package com.example;

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

}

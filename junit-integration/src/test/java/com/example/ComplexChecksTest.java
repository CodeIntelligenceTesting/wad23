package com.example;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.Test;

public class ComplexChecksTest {

    @Test
    public void firstUnitTest() {
        assertDoesNotThrow(() -> ExploreMe.exploreComplexChecks(0, 0, "".getBytes()));
    }

    @Test
    public void secondUnitTest() {
        assertDoesNotThrow(() -> ExploreMe.exploreComplexChecks(100, 200, "WAD32".getBytes()));
    }

}

package com.example;

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

}

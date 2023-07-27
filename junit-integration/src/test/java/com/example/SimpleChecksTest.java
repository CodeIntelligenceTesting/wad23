package com.example;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.Test;

public class SimpleChecksTest {

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

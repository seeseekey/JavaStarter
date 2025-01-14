package org.example.starter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ApplicationTests {

    @Test
    void testMinimalClass() {

        Application minimal = new Application();
        assertNotNull(minimal);
    }
}

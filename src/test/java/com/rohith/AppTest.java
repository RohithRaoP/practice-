package com.rohith;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testAddition() {
        App app = new App();
        assertEquals(30, app.add(10, 20));
    }
}

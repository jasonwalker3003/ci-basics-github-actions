package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloControllerTests {

    @Test
    void homePageSaysHello() {
        assertEquals("Hello from my CI pipeline\n", new HelloController().hello());
    }

}

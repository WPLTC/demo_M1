package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HellocontrollerTest {

    @Test
    public void testHello() {
        Hellocontroller controller = new Hellocontroller();

        String result = controller.hello();
        assertEquals("Hello, CI/CD M1!", result);
    }


    @Test
    public void testSubtractTest() {
        Hellocontroller controller = new Hellocontroller();
        int result = controller.subtractTest();
        assertEquals(7, result);
    }

    @Test
    public void testSubtractThreeTest() {
        Hellocontroller controller = new Hellocontroller();
        int result = controller.subtractThreeTest();
        assertEquals(5, result);
    }

}
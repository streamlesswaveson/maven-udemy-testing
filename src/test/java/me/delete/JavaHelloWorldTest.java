package me.delete;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaHelloWorldTest {

    @Test
    public void sayHello() {
        assertEquals("Hello world", new JavaHelloWorld().getHello());
    }

}
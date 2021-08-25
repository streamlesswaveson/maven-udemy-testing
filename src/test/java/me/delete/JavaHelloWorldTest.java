package me.delete;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaHelloWorldTest {

    @Test
    public void sayHello() {
        assertEquals("Hello world", new JavaHelloWorld().getHello());
    }

}
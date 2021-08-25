package me.delete;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaHelloWorldTest {

    @Test
    public void getHello() {
        JavaHelloWorld helloWorld = new JavaHelloWorld();
        assertEquals("Hello world", helloWorld.getHello());
    }

}
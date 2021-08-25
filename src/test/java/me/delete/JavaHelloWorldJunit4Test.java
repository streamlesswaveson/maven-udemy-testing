package me.delete;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaHelloWorldJunit4Test {

    @Test
    public void shouldSayHello() {
        assertEquals("Hello world", new JavaHelloWorld().getHello());
    }
}

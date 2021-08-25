package me.delete;


public class JavaHelloWorldTest {

    /*
    Note - no testing frameworks have been set up.  This is the default behavior of the
    surefire plugin.
    Pojo testing is going to pick up anything that begins/ends with test
     */
    public void testSayHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assert("Hello world".equals(javaHelloWorld.getHello()));
    }

}
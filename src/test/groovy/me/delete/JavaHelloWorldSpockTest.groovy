package me.delete

import spock.lang.Specification

class JavaHelloWorldSpockTest extends Specification {
    def "GetHello"() {
        expect:
        1 == 1
    }

    def "SomethingElse"() {
        when:
        def foo = "123"

        then:
        true
    }
}

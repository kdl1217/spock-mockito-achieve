package com.kon

import spock.lang.Specification
import spock.lang.Unroll

/**
 * 简单Spock测试
 *
 *                          ------------------------------
 *                          ｜                            ↓
 *      setupSpec() ->  [setup() -> def 自定义方法 ——> cleanup()] -> cleanupSpec()
 *                          ↑                            ｜
 *                          ------------------------------
 *
 * @author kon, created on 2023/12/28T10:46.
 * @version 0.1
 */
class SimpleSpec extends Specification {

    // 初始化
    def setupSpec() {
        println ">>>>> 初始化"
    }

    def setup() {
        println ">>>>> setup"
    }

    def cleanup() {
        println ">>>>> cleanup"
    }

    def cleanupSpec() {
        println ">>>>> cleanupSpec"
    }

    @Unroll
    def "测试"() {

        given:
        def a = 1
        def b = 2

        expect:
        a < b

        println "a = $a, b = $b"
    }

    @Unroll
    def "测试 where"() {
        given:
        def a = n1
        def b = n2
        def c = n3

        expect:
        c > b && b > a
        println "a = $a, b = $b, c = $c"

        where:
        n1 << [1, 2, 3]
        n2 << [2, 3, 4]
        n3 << [3, 4, 5]
    }

    @Unroll
    def "测试 when then"() {
        given:
        def a = n1
        def b = n2

        when:
        def c = a + b
        println "when a = $a, b = $b, c = $c"

        then:
        c == n3

        where:
        n1 | n2 || n3
        1  | 2  || 3
        2  | 3  || 5
    }

    @Unroll
    def "maximum of two numbers"() {
        expect:
        Math.max(a, b) == c

        where:
        a | b || c
        1 | 3 || 3
        7 | 4 || 7
        0 | 0 || 0
    }


//    @Unroll
//    def "maximum of #a and #b is #c"() {
//        expect:
//        Math.max(a, b) == c
//
//        where:
//        a | b || c
//        1 | 3 || 3
//        7 | 4 || 7
//        0 | 0 || 0
//    }

}

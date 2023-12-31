package com.example.sumatorianumeros

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun resta(){
        val resta = {x:Int,y:Int -> x - y}
        assertEquals(0, resta(2,2))
    }

    @Test
    fun cubo(){
        val cubo= {x:Int -> x * x * x}
        assertEquals(27, cubo(3))
    }
}
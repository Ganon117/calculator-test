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
    fun triple_producto(){
        val triple_producto= {x:Int -> 3 * x}
        assertEquals(9, resta(3))
    }
}
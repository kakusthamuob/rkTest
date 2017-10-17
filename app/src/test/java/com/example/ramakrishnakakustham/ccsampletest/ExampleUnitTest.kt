package com.example.ramakrishnakakustham.ccsampletest

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
        val obj = RKUtil()
        val res = obj.Add(12,43)
        assertEquals(55, res)
    }
}

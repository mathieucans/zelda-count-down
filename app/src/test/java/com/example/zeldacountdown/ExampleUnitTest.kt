package com.example.zeldacountdown

import org.junit.Test

import org.junit.Assert.*
import java.time.LocalDate

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun zero_day_left_the_day_of_release() {
        val today = LocalDate.parse("2023-05-12")
        val daysLeft = ZeldaCountDown(today).daysLeft()
        assertEquals(0, daysLeft)
    }

    @Test
    fun one_day_left_the_day_before_of_release() {
        val today = LocalDate.parse("2023-05-11")
        val daysLeft = ZeldaCountDown(today).daysLeft()
        assertEquals(1, daysLeft)
    }

    @Test
    fun `151 days left from 2022 - 12 - 12`() {
        val today = LocalDate.parse("2022-12-12")
        val daysLeft = ZeldaCountDown(today).daysLeft()
        assertEquals(151, daysLeft)
    }

}
package com.example.zeldacountdown

import java.lang.Math.abs
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneOffset

class ZeldaCountDown(
    val today: LocalDate)
{

    private val releaseDate = LocalDate.parse("2023-05-12")

    fun daysLeft(): Long {
        val difference: Long = abs(this.today.toEpochDay() - this.releaseDate.toEpochDay())
        return difference
    }
}

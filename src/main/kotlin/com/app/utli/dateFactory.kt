package com.app.utli

import java.util.*

object dateFactory {
    fun gen(year: Int, month: Int, day: Int): Calendar {
        return Calendar
            .getInstance()
            .apply {
                set(Calendar.YEAR,year)
                set(Calendar.MONTH,month)
                set(Calendar.DATE,day)
            }
    }
}
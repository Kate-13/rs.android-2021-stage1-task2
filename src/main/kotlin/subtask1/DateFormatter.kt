package subtask1

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.TextStyle
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        var result = ""
        val intyear = year.toInt()
        val intmonth = month.toInt()
        val intday = day.toInt()

        try {
            val date = LocalDate.of(intyear, intmonth, intday)
            val text_month = date.month.getDisplayName(TextStyle.FULL, Locale("RU"))
            val text_day_of_the_week = date.dayOfWeek.getDisplayName(TextStyle.FULL, Locale("RU"))

            result = day + " " + text_month + ", " + text_day_of_the_week
        } catch (e: DateTimeException) {
            result = "Такого дня не существует"
        }

        return result
    }
}

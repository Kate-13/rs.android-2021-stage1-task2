package subtask3

import kotlin.reflect.KClass

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter


class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        var result: Any = 0
        if (blockB == String::class) {
            val r = blockA.filterIsInstance<String>()
            result = r.joinToString(separator = "")
        }
        if (blockB == Int::class) {
            result = blockA.filterIsInstance<Int>().sum()
        }
        if (blockB == LocalDate::class) {
            val date = blockA.filterIsInstance<LocalDate>().max() ?: throw DateTimeException("Wrong Date")
            val form = DateTimeFormatter.ofPattern("dd.MM.yyyy")
            result = date.format(form)
        }
        return result
    }
}

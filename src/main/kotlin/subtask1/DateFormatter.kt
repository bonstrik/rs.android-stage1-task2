package subtask1

import java.time.LocalDate

val dev = false

val 
    monthMap = mapOf(
        1  to "января",
        2  to "февраля",
        3  to "марта",
        4  to "апреля",
        5  to "мая",
        6  to "июня",
        7  to "июля",
        8  to "августа",
        9  to "сентября",
        10 to "октября",
        11 to "ноября",
        12 to "декабря"
    )
val dayOfW = mapOf(
        1 to "понедельник",
        2 to "вторник",
        3 to "среда",
        4 to "четверг",
        5 to "пятница",
        6 to "суббота",
        7 to "воскресенье"
    )

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        var ok: Boolean
        var d = LocalDate.of(2020, 1, 1)
        try {
            d = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            ok = true
        } catch (e: Exception) {
            ok = false
        }

        var res: String;
        if (!ok) { 
            res = "Такого дня не существует" }
        else {
            res = "${day.toInt()} ${monthMap[month.toInt()]}, ${dayOfW[d.getDayOfWeek().getValue()]}"
        }
        if (dev) {
            println(d)
            println(res)
        }

        return res
    }

}

/*
fun main() {
    val formatter = DateFormatter()

    fun testDateFormatter1() {
        println("Run1")
        if ("15 марта, воскресенье" != formatter.toTextDay("15", "3", "2020"))
          println("Bad")
    }

    fun testDateFormatter2() {
        println("Run2")
        if ("Такого дня не существует" != formatter.toTextDay("29", "2", "2019"))
          println("Bad")
    }

    fun testDateFormatter3() {
        println("Run3")
        if ("19 ноября, четверг" != formatter.toTextDay("19", "11", "1998"))
          println("Bad")
    }

    fun testDateFormatter4() {
        println("Run4")
        if ("31 декабря, вторник" != formatter.toTextDay("31", "12", "2024"))
          println("Bad")
    }

    fun testDateFormatter5() {
        println("Run5")
        if ("Такого дня не существует" != formatter.toTextDay("1", "13", "2020"))
          println("Bad")
    }

    testDateFormatter1()
    testDateFormatter2()
    testDateFormatter3()
    testDateFormatter4()
    testDateFormatter5()

}
*/
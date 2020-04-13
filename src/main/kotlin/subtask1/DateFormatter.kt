package subtask1

import java.time.LocalDate

val dev = false

val 
    monthMap = mapOf(
        1  to "ﭢ���",
        2  to "䥢ࠫ�",
        3  to "����",
        4  to "��५�",
        5  to "���",
        6  to "���",
        7  to "���",
        8  to "������",
        9  to "ᥭ����",
        10 to "������",
        11 to "�����",
        12 to "�������"
    )
val dayOfW = mapOf(
        1 to "�������쭨�",
        2 to "��୨�",
        3 to "�।�",
        4 to "�⢥�",
        5 to "��⭨�",
        6 to "�㡡��",
        7 to "����ᥭ�"
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
            res = "������ ��� �� �������" }
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
        if ("15 ����, ����ᥭ�" != formatter.toTextDay("15", "3", "2020"))
          println("Bad")
    }

    fun testDateFormatter2() {
        println("Run2")
        if ("������ ��� �� �������" != formatter.toTextDay("29", "2", "2019"))
          println("Bad")
    }

    fun testDateFormatter3() {
        println("Run3")
        if ("19 �����, �⢥�" != formatter.toTextDay("19", "11", "1998"))
          println("Bad")
    }

    fun testDateFormatter4() {
        println("Run4")
        if ("31 �������, ��୨�" != formatter.toTextDay("31", "12", "2024"))
          println("Bad")
    }

    fun testDateFormatter5() {
        println("Run5")
        if ("������ ��� �� �������" != formatter.toTextDay("1", "13", "2020"))
          println("Bad")
    }

    testDateFormatter1()
    testDateFormatter2()
    testDateFormatter3()
    testDateFormatter4()
    testDateFormatter5()

}
*/
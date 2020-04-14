package subtask2

val nums = mapOf(
        1 to "one",
        2 to "two",
        3 to "three",
        4 to "four",
        5 to "five",
        6 to "six",
        7 to "seven",
        8 to "eight",
        9 to "nine",
        10 to "ten",
        11	to "eleven",
        12	to "twelve",
        13	to "thirteen",
        14	to "fourteen",
        15	to "fifteen",
        16	to "sixteen",
        17	to "seventeen",
        18	to "eighteen",
        19	to "nineteen",
        20	to "twenty",
        21	to "twenty one",
        22	to "twenty two",
        23	to "twenty three",
        24	to "twenty four",
        25	to "twenty five",
        26	to "twenty six",
        27	to "twenty seven",
        28	to "twenty eight",
        29	to "twenty nine"
    )

class TimeConverter {
    fun toTextFormat(hour: String, minute: String): String {
        val h = hour.toInt()
        val m = minute.toInt()
        
        if (h > 12) return ""

        return when (m){
            0 -> "${nums[h]} o' clock"
            1 -> "one minute past ${nums[h]}"
            in (2..14)+(16..29) -> "${nums[m]} minutes past ${nums[h]}"
            15 -> "quarter past ${nums[h]}"
            30 -> "half past ${nums[h]}"
            in (31..44)+(46..58) -> "${nums[60 - m]} minutes to ${nums[if (h+1 == 13) 1 else h+1]}"
            59 -> "1 minute to ${nums[if (h+1 == 13) 1 else h+1]}"
            45 -> "quarter to ${nums[if (h+1 == 13) 1 else h+1]}"
            else -> ""
        }
    }
}


/*
fun main() {
    val converter = TimeConverter()

    fun testTimeConverter1() {
    println("Run1")
        if ("eleven o' clock" != converter.toTextFormat("11", "00")) println("Bad")
    }

    fun testTimeConverter2() {
    println("Run2")
        if ("five minutes past nine" != converter.toTextFormat("9", "05")) println("Bad")
    }

    fun testTimeConverter3() {
    println("Run3")
        if ("quarter past four" != converter.toTextFormat("4", "15")) println("Bad")
    }

    fun testTimeConverter4() {
    println("Run4")
        if ("half past two" != converter.toTextFormat("2", "30")) println("Bad")
    }

    fun testTimeConverter5() {
    println("Run5")
        if ("twenty two minutes to six" != converter.toTextFormat("5", "38")) println("Bad")
    }

    fun testTimeConverter6() {
    println("Run6")
        if ("quarter to six" != converter.toTextFormat("5", "45")) println("Bad")
    }

    fun testTimeConverter7() {
    println("Run7")
        if ("two minutes to eleven" != converter.toTextFormat("10", "58")) println("Bad")
    }

    fun testTimeConverter8() {
    println("Run8")
        if ("" != converter.toTextFormat("11", "62")) println("Bad")
    }

    testTimeConverter1()
    testTimeConverter2()
    testTimeConverter3()
    testTimeConverter4()
    testTimeConverter5()
    testTimeConverter6()
    testTimeConverter7()
    testTimeConverter8()

}
*/
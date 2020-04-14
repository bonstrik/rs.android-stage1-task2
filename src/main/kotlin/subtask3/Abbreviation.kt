package subtask3

class Abbreviation {
}


fun Abbreviation.abbreviationFromA(a: String, b: String): String {
     val a = a.toUpperCase()
     var i = 0; var j = 0
     while ((i < b.length) and (j < a.length)) {
         if (b[i] == a[j]) {
             i++; j++
         } else {
             j++
         }
     }
     if (i < b.length) {
         return "NO"
     } else {
         return "YES"
     } 
}

fun main() {
    val converter = Abbreviation()
    
    fun testAbbreviation1() {
    println("Run1")
        if ("YES" != converter.abbreviationFromA("daBcd", "ABC"))
            println("Bad")
    }

    fun testAbbreviation2() {
    println("Run2")
        if ("YES" != converter.abbreviationFromA("mnbTy", "BT"))
            println("Bad")
    }

    fun testAbbreviation3() {
    println("Run3")
        if ("YES" != converter.abbreviationFromA("qWerty", "WY"))
            println("Bad")
    }

    fun testAbbreviation4() {
    println("Run4")
        if ("NO" != converter.abbreviationFromA("ytrewq", "RY"))
            println("Bad")
    }

    fun testAbbreviation5() {
    println("Run5")
        if ("NO" != converter.abbreviationFromA("abhfs", "ASCI"))
            println("Bad")
    }
    testAbbreviation1()
    testAbbreviation2()
    testAbbreviation3()
    testAbbreviation4()
    testAbbreviation5()

}
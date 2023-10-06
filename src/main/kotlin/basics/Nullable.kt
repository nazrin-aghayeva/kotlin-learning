package basics

fun main() {
    var b: String? = "naza"
    b = null // ok
    print(b?.length)

    val listOfNums: List<Int?> = listOf(2, 3, null)
    for(el in listOfNums){
        el?.let { println(it) }
    }

    class Person {

    }

    val person: Person? = null
    println(person.toString())

    // elvis operator
    val l = b?.length ?: -1
    println(l)

    // !! operator
    // val s = b!!.length

    val a: Int? = 3
    val aInt: Double? = a as? Double
    println(aInt)

    // nullable Lists
    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()
}

package basics

fun main() {
    // trailing lambdas
    val items = listOf(1, 2, 3)
    val product = items.fold(1) { acc, e -> acc * e }
    println(product)
    val filtered = items.filter { it > 2 }
    println(filtered)
    // unused var
    val map = mapOf("A" to 1, "B" to 2, "C" to 3)
    map.forEach { (_, value) -> println("$value!") }
}
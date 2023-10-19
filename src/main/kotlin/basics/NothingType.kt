package basics

fun main() {
    fun fail(message: String): Nothing {
        throw IllegalArgumentException(message);
    }
    fail("FAILED")
}
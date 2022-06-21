fun main(args: Array<String>) {
    var lan = "Java"
    val array = arrayOf(1,2,3,4,5)
    println(array[0])
    println("Hello World!")
    val example= """ 
        Hello
        World!
    """.trimIndent()

    val value1 = 11
    val toLong = value1.toLong()

    println(example)
    lan = "Matrix"
    println(lan)
    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")
}
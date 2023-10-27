package classes
 fun main() {
        open class Shape
        class Rectangle : Shape()

        fun Shape.getName() = "Shape"
        fun Rectangle.getName() = "Rectangle"

        fun printClassName(s: Shape) {
            println(s.getName())
        }

        printClassName(Rectangle())

     class Example {
         fun printFunctionType() { println("Class method") }
     }

     fun Example.printFunctionType() { println("Extension function") }

     Example().printFunctionType()
    }

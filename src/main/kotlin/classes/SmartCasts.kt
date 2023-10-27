package classes

fun eval(expr: Expr): Int {
    return when (expr) {
        is Num -> expr.value
        is Sum -> {
            val sum = expr as Sum
            eval(sum.left) + eval(sum.right)
        }
        else -> throw IllegalArgumentException("Unknown expression")
    }
}

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
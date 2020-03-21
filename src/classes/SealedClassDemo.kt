package classes

sealed class Expression

data class Num(val number: Double) : Expression()
data class Sum(val e1: Expression, val e2: Expression) : Expression()
object NotANumber : Expression()

fun eval(expression: Expression): Double = when (expression) {
    is Num -> expression.number
    is Sum -> eval(expression.e1) + eval(expression.e2)
    is NotANumber -> Double.NaN
}

fun main(args: Array<String>) {
    val num1 = Num(5.5)
    val num2 = Num(10.5)
    println("The sum of ${num1.number} and ${num2.number} is ${eval(Sum(num1, num2))}")
}
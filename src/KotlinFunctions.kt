typealias operation = (Int, Int) -> Int

fun main(args: Array<String>) {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    var function: (Int, Int) -> Int = ::add

    println(function(5, 3))

    function = ::subtract

    println(function(5, 3))

    fun printRes(func: (Int, Int) -> Int, a: Int, b: Int) {
        val result = func(a, b)
        println(result)
    }

    printRes(::add, 4, 3)
    printRes(::subtract, 4, 2)

    fun printResult2(function: operation,a: Int, b: Int){}
}
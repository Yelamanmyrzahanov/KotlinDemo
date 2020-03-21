package classes

import utils.lastChar

val MoviesList.movieSize:Int
    get()  = movies.size

fun main(args: Array<String>) {
    println("TestStringLastChar".lastChar())
}
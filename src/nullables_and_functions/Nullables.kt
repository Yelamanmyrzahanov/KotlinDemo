package nullables_and_functions

private fun main(args: Array<String>) {
    var result: Int? = 30
    println(result)

    //println(result+1) // gives Error:(5, 19) Kotlin: Operator call corresponds to a dot-qualified call 'result.plus(1)' which is not allowed on a nullable receiver 'result'.
    val newResult = result?.plus(5)

    println(result!! + 1) // doesnt give an error

    var x: Int? = null
    if (x != null) {
        x += 1
    }
    println(x)

    var authorName: String? = "Aboka"
    var authorAge: Int? = 30

    var unwrappedAuthorName = authorName!!
    println("Author name is $unwrappedAuthorName")


    if (authorName != null) {
        println("Author is $authorName")
    } else {
        println("No author")
    }

//    authorName = null
    authorName?.let { name ->
        println("Author is $name")
    }

    var nullableInt: Int? = 10
    var mustHaveResult = nullableInt ?: 0 //nice shortcut for not using if else statements

}
package classes

fun main(args: Array<String>) {
    class Person(var firstName: String, var secondName: String) {
        var fullName: String?
        init {
            println("Init 1")
            fullName = firstName+ " " + secondName
        }

        init {
            println("Init 2")
        }
    }

    val person = Person("Yela", "Myrza")
    println(person.fullName)
}
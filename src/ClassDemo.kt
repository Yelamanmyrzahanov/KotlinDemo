class Person(
    var firstName: String
){
    var secondName: String? = null
    constructor(firstName: String, lastName: String) : this(firstName) {
        this.secondName = lastName
    }
}

fun main(args: Array<String>) {
    val person = Person("Yela")
    val personWithLastName = Person("Sam","Gambee")
}
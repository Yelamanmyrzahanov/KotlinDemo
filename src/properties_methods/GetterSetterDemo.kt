package properties_methods

class Person(
    val firstName: String? = null,
    val lastName: String? = null
) {
    val salutation = "Mr."
    val fullName: String
        get() {
            return firstName + " " + lastName
        }

    var otherPrivateName: String = "nickname"
        private set
}

var itemList: ArrayList<String> = ArrayList<String>()
    set(value) {
        field = value
        //Do smth else
    }

fun main(args: Array<String>) {
    val person = Person("Sam", "Smith")
//    person.otherPrivateName = "ASdasd" // gives error because of private set
    println(person.fullName+ " Nickname is ${person.otherPrivateName}")
}
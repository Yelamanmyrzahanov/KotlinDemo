package properties_methods

class PersonEx {
    var firstName = ""
    var child = ChildEx()

    fun setFirst(firstName: String){
        this.firstName = firstName
    }

    inner class ChildEx{
        var firstName = ""

        fun printParentage(){
            println("Child ${this@ChildEx.firstName} with parent ${this@PersonEx.firstName}")
        }
    }
}

fun main(args: Array<String>) {
    val person = PersonEx()
    person.firstName = "John"
    person.child.firstName = "Smith"
    person.child.printParentage()
}
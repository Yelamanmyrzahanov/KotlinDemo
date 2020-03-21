package classes

class StudentCompanionExample private constructor() {
    var firstName: String? = null
    var lastName: String? = null

    companion object Loeader {
        fun loadStudent(jsonText: String):StudentCompanionExample{
            val student = StudentCompanionExample()
            student.firstName = "Yela"
            student.lastName = "Mrz"
            return student
        }
    }
}

fun main(args: Array<String>) {
    val studentCompanionExample = StudentCompanionExample.loadStudent("JSON FAke text")
}
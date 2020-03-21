package properties_methods

import kotlin.properties.Delegates

class Human(var firstName: String, var lastName: String){
    lateinit var fullName: String

    init {
        fullName = "$firstName $lastName"
    }

    fun printFullName(){
        if (!this::fullName.isInitialized){
            fullName = "$firstName $lastName"
        }
        println(fullName)
    }
}

/**
 * Create a class named Course that takes a className String parameter
 * Add a private lateinit variable for the Teacher's name
 * Then create a setTecherName function that sets that variable
 */

// Your solution here
class Course(var className:String){
    var room: String by Delegates.observable("No Room") {
            property, oldValue, newValue ->
        println("New value is $newValue")
    }
    private lateinit var teacherName:String

    fun setTeacherName(teacherName:String){
        this.teacherName = teacherName
    }
}

/**
 * Add a main function, create a Course and set the teacher name
 */
fun main(args: Array<String>) {

// Your solution here
    val course = Course("Turkish")
    course.setTeacherName("Ali Ozgezici")

    val scienceCourse : Course by lazy {
        Course("Science")
    }
}
package properties_methods

import kotlin.properties.Delegates

data class CourseObservableEx(var className: String) {
    //(OBSERVABLE DELEGATE) delegate notifies you when the variable changes
    var room: String by Delegates.observable("No room"){
        property, oldValue, newValue ->
        println("new values is $newValue")
    }
}

// (MAP DELEGATE) if you receive data in maps, it can be usefull to initialize a class with that map
data class CourseMapEx(val map: Map<String, Any>){
    val roomEx: String by map
    val teacherEx: String by map
}

// (LAZY DELEGATE)Science course will be created when its first used and will be cached. New ones wont be created every time it's called
val scienceCourse: Course by lazy {
    Course("Science")
}

/**
 * Copy the Course class you created in the lateinit challenge
 * and add a courseDescription String that is created with the lazy function
 * Have the returned string contain the className and the teacherName
 */
/**
 *  add a room String variable that is an Observable, has a "No Room" initial value
 *  and prints out the new value
 */
// Your solution here
class CourseEx(var className:String){
    private lateinit var teacherName:String
    private val courseDesc:String by lazy {
        "Class is $className, teacher is $teacherName"
    }

    var room:String by Delegates.observable("No Room"){
        property, oldValue, newValue ->
        println("Room changed: $newValue")
    }

    fun setTeacherName(teacherName:String){
        this.teacherName = teacherName
    }

    fun getClassInfo():String{
        return courseDesc
    }
}

/**
 * Add a main function, create a Course and set the teacher name,
 * room and print out the courseDescription
 */

fun main(args: Array<String>) {
    val courseMapEx = CourseMapEx(mapOf("room" to "Room1","teacher" to "Ms Aigul"))
    println(courseMapEx)

    //Challenge solution code
    val course = CourseEx("Turkish")
    course.setTeacherName("Ali Ozgezici")
    course.room = "Meeting room"
    println(course.getClassInfo())
}
package classes

object MySingleton{
    fun doMyStuff(data:String){
        println("This is my data $data")
    }

    val myConstant = "This is mine Constant"
}

//**
//* Given the Student data class below, create a StudentRegistry
//* singleton that has a list of students and can add and remove a
//* student from that list.
//*
//*/
data class StudentC(val firstName: String, val lastName: String)

// Add the StudentRegistry class here
object StudentRegistry{
    val studentsList = mutableListOf<StudentC>()

    fun removeStud(studentC: StudentC){
        studentsList.remove(studentC)
    }

    fun addStud(studentC: StudentC){
        studentsList.add(studentC)
    }
}
// Your Solution Here

/**
 * Add 2 students to the registry and then print out the list
 */
// Add main function and print out the students
fun main(args: Array<String>) {
    MySingleton.doMyStuff("Salem alem and ${MySingleton.myConstant}")

    //Challenge code starts here
    StudentRegistry.addStud(StudentC("Yelaman","Mrzkgasda"))
    StudentRegistry.addStud(StudentC("Yelamanwman","Mrzkgasdamasdsadas"))

    StudentRegistry.studentsList.forEach{student->
        println("${student.firstName} $student.")
    }

}


/**
 * Add 2 students to the registry and then print out the list
 */
//
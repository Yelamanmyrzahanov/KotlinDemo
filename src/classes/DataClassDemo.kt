package classes

fun main(args: Array<String>) {
    data class Podcast(
        val title:String,
        val description:String,
        val url:String
    )

    val podcast = Podcast(
        "Android Central",
        "Podcast desc",
        "https://www.youtube.com/watch?v=5qap5aO4i9A"
    )

    val podcast2 = podcast.copy(title = "Copied podcast")

    val (title, description, url) = podcast2
    println("title = $title, url = $url")

    // Challenge with Student
    val sam = Student("Sam","Memeson",'A')
    println(sam)
    val bam = sam.copy(grade = 'B',firstName = "Bam")
    println(bam)

    val jambo = StudentWithAGrade("Jambo", "Jetpisbay")
    println(jambo)
}

data class Student(
    val firstName: String,
    val lastName: String,
    val grade: Char
)

data class StudentWithAGrade(
    val firstName: String,
    val lastName: String,
    val grade: Char = 'A'
)


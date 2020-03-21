package classes

interface Animal {
    val numLegs: Int
    fun eat()

    fun voice()
}

class Dog() : Animal {
    override val numLegs: Int = 4

    override fun eat() {
        println("Dog Eats meet")
    }

    override fun voice() {
        println("Bark bark")
    }
}

class Cat() : Animal {
    override val numLegs: Int = 4
    override fun eat() {
        println("Cat eats fish meet")
    }

    override fun voice() {
        println("Meow meow")
    }
}

/**
 * Create a Shape interface with 2 integer properties named:
 * width, height.
 * Add a function named draw
 */

// Your Solution Here
interface Shape {
    val width: Int
    val height: Int

    fun draw()
}

/**
 * Create a Circle that takes these values in the constructor and implements the Shape
 * Interface
 */
// Your Solution Here
class Circle(override val width: Int, override val height: Int) : Shape {
    override fun draw() {
        println("Drawing Circle...")
    }

}


/**
 * Create a Line that takes these values in the constructor and implements the Shape
 * Interface
 */
// Your Solution Here
class Line(override val width: Int, override val height: Int) : Shape{
    override fun draw() {
        println("Drawing Circle...")
    }

}

/**
 * Create a function named printShape that takes a shape and calls the draw method
 */

fun printShape(shape: Shape){
    shape.draw()
}

/**
 * Create a circle and a line and call printShape on both
 */


fun main(args: Array<String>) {
    val dog = Dog()
    val cat = Cat()

    dog.eat()
    cat.eat()

    //Challenge solution code

    val circle = Circle(4,4)
    val line = Line(4,1)

    printShape(circle)
    printShape(line)
}
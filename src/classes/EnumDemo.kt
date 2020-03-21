package classes

enum class Direction{
    NORTH, SOUTH, EAST, WEST;

    fun printDirection(){
        println("I am going to $this")
    }
}

enum class Color(val r:Int, val g:Int, val b:Int){
    RED(255,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0)
}

fun drive(direction: Direction){
    when(direction){
        Direction.NORTH -> println("Driving NORTH")
        Direction.SOUTH -> println("Driving SOUTH")
        Direction.EAST -> println("Driving EAST")
        Direction.WEST -> println("Driving WEST")
    }
}

/**
 * Create an enum called Animals and add the following types:
 * CAT, DOG, RAT, BIRD, HAMSTER
 */

// Your Solution Here
enum class Animals{
    CAT, DOG, RAT, BIRD, HAMSTER
}

/**
 * Create another enum called Cage and add the following:
 * SMALL, MEDIUM, LARGE
 */
// Your Solution Here
enum class Cage{
    SMALL, MEDIUM, LARGE
}

/**
 * Write a function named addAnimalToCage that takes a animal and Cage and print
 * out the animal and the cage that it will be in
 */
// Your Solution Here
fun addAnimalToCage(animal: Animals,cage: Cage){
    println("Animal $animal will be in $cage cage")
}


/**
 * Call addAnimalToCage multiple times with different animals and cages
 * Try to use the appropriate cage size for the animal
 */


fun main(args: Array<String>) {
    drive(Direction.NORTH)
    drive(Direction.WEST)

    println(Direction.valueOf("NORTH")) // convert enum to string
    println(Direction.NORTH.ordinal) //prints position
    println(Direction.WEST.printDirection()) //prints directin using enum function

    addAnimalToCage(Animals.DOG,Cage.LARGE)
    addAnimalToCage(Animals.CAT,Cage.MEDIUM)
    addAnimalToCage(Animals.BIRD,Cage.SMALL)
}
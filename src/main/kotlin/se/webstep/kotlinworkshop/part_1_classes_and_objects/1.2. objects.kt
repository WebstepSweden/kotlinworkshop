package se.webstep.kotlinworkshop.part_1_classes_and_objects

import java.util.*

/***********/
/* Objects */
/***********/

/**
 * Objects are singletons. Fields and methods defined in objects are similar
 * to static fields and methods in Java.
 *
 * The following example defines an object with a field and a function
 */
object AnimalGenerator {
    private val random = Random()
    fun generateSomeRandomAnimals(): List<Animal> {
        val animalNames = listOf("Gerard", "Per-Henrik", "Izhak")
        val animalTypes = listOf("Lion", "Zebra", "Crocodile")

        return (0..5).map {
            val name = animalNames[random.nextInt(animalNames.size)]
            val type = animalTypes[random.nextInt(animalTypes.size)]
            val legs = random.nextInt(10)
            Animal(name, type, legs)
        }
    }
}


/**************/
/* try it out */
/**************/

fun main(args: Array<String>) {
    AnimalGenerator.generateSomeRandomAnimals().forEach {
        println("${it.name} is a ${it.type} who has ${it.numberOfLegs} legs") // it is the current instance in the iteration
    }

    // or, if you want:
    // AnimalGenerator.generateSomeRandomAnimals().forEach { animal ->
    //     println("${animal.name} is a ${animal.type} who has ${animal.numberOfLegs} legs")
    // }
}


/*********************/
/* Companion objects */
/*********************/

/**
 * Companion objects are defined inside classes and are often used as factories
 */
class Furniture(val legs: Int, val name: String) {
    companion object {
        fun createChair() = Furniture(4, "Chair")
        fun createTable() = Furniture(4, "Table")
    }
}

// usage:
val chair = Furniture.createChair()
val table = Furniture.createTable()


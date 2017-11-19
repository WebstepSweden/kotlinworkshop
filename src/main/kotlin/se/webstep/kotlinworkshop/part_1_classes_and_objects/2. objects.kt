package se.webstep.kotlinworkshop.part_1_classes_and_objects

import java.util.*

/***********/
/* Objects */
/***********/

/** Define an object with a "static" function */
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

fun main(args: Array<String>) {
    AnimalGenerator.generateSomeRandomAnimals().forEach {
        println("${it.name} is a ${it.type} who has ${it.numberOfLegs} legs")
    }

    // or, if you want:
    // AnimalGenerator.generateSomeRandomAnimals().forEach { animal ->
    //     println("${animal.name} is a ${animal.type} who has ${animal.numberOfLegs} legs")
    // }
}

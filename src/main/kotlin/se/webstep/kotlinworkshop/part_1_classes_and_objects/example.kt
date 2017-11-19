package se.webstep.kotlinworkshop.part_1_classes_and_objects

import java.util.*

/**
 * Define a class named Animal
 * Define a constructor which takes 3 arguments, of which one is non mandatory
 * Define three getters (val och var) and one setter (var)
 */
class Animal(var name: String, val type: String, val numberOfLegs: Int = 4)

val steveTheDog = Animal("Steve", "dog") // use the given order of arguments to create an instance, skipping the free argument
val ingelaTheDove = Animal(numberOfLegs = 2, name = "Ingela", type = "dove") // use named arguments to create an instance
val animals = listOf(steveTheDog, ingelaTheDove) // shortcut for creating a list

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

// main function, defined outside of a class
fun main(args: Array<String>) {
    steveTheDog.name = "Allan"
    animals.forEach { println("${it.name} is a ${it.type} who has ${it.numberOfLegs} legs") }
    AnimalGenerator.generateSomeRandomAnimals().forEach { println("${it.name} is a ${it.type} who has ${it.numberOfLegs} legs") }
}

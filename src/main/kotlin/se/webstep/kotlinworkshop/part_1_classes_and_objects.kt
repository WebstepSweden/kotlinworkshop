package se.webstep.kotlinworkshop

import java.util.*

/* Example */

/**
 * Define a class named Animal
 * Define a constructor which takes 3 arguments, of which one is non mandatory
 * Define three getters (val och var) and one setter (var)
 */
class Animal(var name: String, val type: String, val numberOfLegs: Int = 4)

val steveTheDog = Animal("Steve", "dog") // use the given order of arguments to create an instance, skipping the free argument
val ingelaTheDove = Animal(numberOfLegs = 2, name = "Ingela", type = "dove") // use named arguments to create an instance
val animals = listOf(steveTheDog, ingelaTheDove) // shortcut for creating a list

// main function, defined outside of a class
fun main(args: Array<String>) {
    steveTheDog.name = "Allan"
    animals.forEach { println("${it.name} is a ${it.type} who has ${it.numberOfLegs} legs") }
    AnimalGenerator.generateSomeRandomAnimals().forEach { println("${it.name} is a ${it.type} who has ${it.numberOfLegs} legs") }
}

object AnimalGenerator {
    val random = Random()
    fun generateSomeRandomAnimals(): List<Animal> {
        val names = listOf("Gerard", "Per-Henrik", "Izhak")
        val types = listOf("Lion", "Zebra", "Crocodile")

        return (0..10).map {
            val name = names[random.nextInt(animals.size+1)]
            val type = types[random.nextInt(animals.size+1)]
            val legs = random.nextInt(1000)
            Animal(name, type, legs)
        }
    }
}

/* Exercise */

/**
 * Define a class named Food
 * It should be able to
 */
class Food(val name: String, var taste: String = "sweet")

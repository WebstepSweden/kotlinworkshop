import java.util.Random

/***********/
/* Classes */
/***********/

/**
 * Kotlin classes are very compact. In only one row you can define both the class structure,
 * the default constructor and the fields and their getters and setters.
 *
 * The following class:
 *
 * - defines a class named Animal
 * - defines a constructor which takes 3 arguments, of which one is non mandatory
 * - defines three getters (val och var) and one setter (var)
 */
class Animal(var name: String, val type: String, val numberOfLegs: Int = 4)

// In Kotlin, you don't need the new keyword for creating new instances.
// Examples for constructing instances of the class:

// use the given order of arguments to create an instance, skipping the free argument
val steveTheDog = Animal("Steve", "dog")

// use named arguments to create an instance
val ingelaTheDove = Animal(numberOfLegs = 2, name = "Ingela", type = "dove")

/**************/
/* try it out */
/**************/

//steveTheDog.name = "Allan" // ok, name is a var
//steveTheDog.type = "Owl" // not ok, type is a val

// shortcut for creating a list
//listOf(steveTheDog, ingelaTheDove).forEach {
//    println("${it.name} is a ${it.type} who has ${it.numberOfLegs} legs")
//}












/****************/
/* Constructors */
/****************/

// init is called whenever a new instance is constructed.
// Default constructor is built in the class definition
// Overridden constructors can be added using the constructor function.
class Url(protocol: String, host: String) {
    private var address = "" // private field with no getter and setter

    // initialization
    init {
        address = "$protocol://$host"
    }

    // overridden constructor
    constructor(host: String) : this("http", host)

    override fun toString(): String = address
}

/**************/
/* try it out */
/**************/

//Url("http", "bisnode.com")
//Url("webstep.se")
















/***************/
/* inheritance */
/***************/

/** An open class can be inherited. Otherwise it is final. */
open class Shape(val edges: Int)

// When defining an inherited class, call the super constructor directly
class Triangle : Shape(3)

class Rectangle : Shape(4)
//class Square: Rectangle() // nope, Rectangle is final

/**************/
/* Exercise!  */
/**************/


















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

//AnimalGenerator.generateSomeRandomAnimals().forEach {
//    println("${it.name} is a ${it.type} who has ${it.numberOfLegs} legs") // it is the current instance in the iteration
//}

// or, if you want:
//AnimalGenerator.generateSomeRandomAnimals().forEach { animal ->
//    println("${animal.name} is a ${animal.type} who has ${animal.numberOfLegs} legs")
//}

/**************/
/* Exercise!  */
/**************/














/****************/
/* Data Classes */
/****************/

/**
 * Data classes are like normal classes, but automatically add som methods such as toString(), hashCode() and equals()
 */

/**
 * Running javap for a class, this is what been generated:
 * - class definition
 * - getters
 * - constructor
 */
class Dog(val name: String, val barksalot: Boolean)
/*
$ javap se/webstep/kotlinworkshop/part_1_classes_and_objects/Dog.class
Compiled from "1.1 classes.kt"
public final class se.webstep.kotlinworkshop.part_1_classes_and_objects.Dog {
  public final java.lang.String getName();
  public final boolean getBarksalot();
  public se.webstep.kotlinworkshop.part_1_classes_and_objects.Dog(java.lang.String, boolean);
}
*/

/**
 * Running javap for a data class, this is what been generated:
 * - class definition
 * - getters
 * - constructor
 * - methods component1() and component2(), used for creating a Pair
 * - copy methods
 * - toString()
 * - hashCode()
 * - equals()
 */
data class Cat(val name: String, val lives: Int)
/*
$ javap se/webstep/kotlinworkshop/part_1_classes_and_objects/Cat.class
Compiled from "1.1 classes.kt"
public final class se.webstep.kotlinworkshop.part_1_classes_and_objects.Cat {
  public final java.lang.String getName();
  public final int getLives();
  public se.webstep.kotlinworkshop.part_1_classes_and_objects.Cat(java.lang.String, int);
  public final java.lang.String component1();
  public final int component2();
  public final se.webstep.kotlinworkshop.part_1_classes_and_objects.Cat copy(java.lang.String, int);
  public static se.webstep.kotlinworkshop.part_1_classes_and_objects.Cat copy$default(se.webstep.kotlinworkshop.part_1_classes_and_objects.Cat, java.lang.String, int, int, java.lang.Object);
  public java.lang.String toString();
  public int hashCode();
  public boolean equals(java.lang.Object);
*/


/**************/
/* try it out */
/**************/

//println(Dog("Joshua", true))
//println(Cat("Berit", 9))


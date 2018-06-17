package se.webstep.kotlinworkshop.part_1_classes_and_objects

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



/****************/
/* Constructors */
/****************/

// init is called whenever a new instance is constructed.
// Default construtor is built in the class definition
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



/***************/
/* inheritance */
/***************/

/** An open class can be inherited. Otherwise it is final. */
open class Shape(val edges: Int)

// When defining an inherited class, call the super constructor directly
class Triangle : Shape(3)

class Rectangle : Shape(4)
//class Square: Rectangle // nope, Rectangle is final



/**************/
/* try it out */
/**************/

/** main function, defined outside of a class */
fun main(args: Array<String>) {
    steveTheDog.name = "Allan" // ok, name is a var
    //steveTheDog.type = "Owl" // not ok, type is a val

    // shortcut for creating a list
    listOf(steveTheDog, ingelaTheDove).forEach {
        println("${it.name} is a ${it.type} who has ${it.numberOfLegs} legs")
    }

    println()

    println(Url("webstep.se"))
}

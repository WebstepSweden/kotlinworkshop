package se.webstep.kotlinworkshop.part_1_classes_and_objects

/***********/
/* Classes */
/***********/

/**
 * Define a class named Animal
 * Define a constructor which takes 3 arguments, of which one is non mandatory
 * Define three getters (val och var) and one setter (var)
 */
class Animal(var name: String, val type: String, val numberOfLegs: Int = 4)

// use the given order of arguments to create an instance, skipping the free argument
val steveTheDog = Animal("Steve", "dog")

// use named arguments to create an instance
val ingelaTheDove = Animal(numberOfLegs = 2, name = "Ingela", type = "dove")

/****************/
/* Constructors */
/****************/

class Url(val protocol: String, val host: String) {
    private var address = ""

    // initialization
    init {
        address = "${protocol}://${host}"
    }

    // overriden constructor
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

package se.webstep.kotlinworkshop.part_4_extension_methods

import se.webstep.kotlinworkshop.part_3_operator_overloading.ComplexNumber

/*********************/
/* extension_methods */
/*********************/

/**
 * Extension methods add functionality to existing classes.
 * They are often used to convert between different classes.
 * They look like that:
 * fun KnownClass.newFunction() = implementation
 */

data class Person(val name: String)

/** An extension method to String that creates an instance of class Person */
fun String.toPerson() = Person(this)

/** An extension method to Int that creates a ComplexNumber */
fun Int.toComplexNumber() = ComplexNumber(this, 0)



/**************/
/* try it out */
/**************/

fun main(args: Array<String>) {
    val bertil = "Bertil Bertilsson".toPerson()
    println(bertil)
    println(8.toComplexNumber())
}
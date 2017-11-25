package se.webstep.kotlinworkshop.part_4_extension_methods

import se.webstep.kotlinworkshop.part_3_operator_overloading.ComplexNumber

/*********************/
/* extention_methods */
/*********************/

data class Person(val name: String)

fun String.toPerson() = Person(this)

fun Int.toComplexNumber() = ComplexNumber(this, 0)

/**************/
/* try it out */
/**************/

fun main(args: Array<String>) {
    val bertil = "Bertil Bertilsson".toPerson()
    println(bertil)
    println(8.toComplexNumber())

}
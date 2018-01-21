package se.webstep.kotlinworkshop.part_2_functions

import java.util.Random

/*************/
/* Functions */
/*************/

/**
 * Functions are defined outside classes (inside they are called methods).
 * A function starts with the keyword fun
 * Arguments type and the return type must be declared.
 */

/** Traditional function, like in Java, looks like that: */
fun add(first: Int, second: Int): Int {
    return first + second
}

/** One line function can also be used. Remember the equals sign, no return required */
fun subtract(first: Int, second: Int): Int = first - second



/******************/
/* default values */
/******************/

/** Functions can have arguments with default values */
fun chooseRandomNumbers(count: Int = 5, limit: Int = 37): List<Int> {
    val random = Random()
    return (0 until count).map { random.nextInt(limit) }
}



/**************/
/* try it out */
/**************/

fun main(args: Array<String>) {
    println("3 + 7 = ${add(3, 7)}")
    println("5 - 3 = ${subtract(5, 3)}")
    println("Random numbers: " + chooseRandomNumbers(limit = 73))
}
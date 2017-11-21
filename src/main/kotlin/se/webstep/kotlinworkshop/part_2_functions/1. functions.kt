package se.webstep.kotlinworkshop.part_2_functions

import java.util.*

/*************/
/* Functions */
/*************/

/** Traditional function, like in Java */
fun add(first: Int, second: Int): Int {
    return first + second
}

/** One line function, remember the equals sign, no return required */
fun subtract(first: Int, second: Int): Int = first - second



/******************/
/* default values */
/******************/

/** Function with a default values */
fun chooseRandomNumbers(count: Int = 5, limit: Int = 37): List<Int> {
    return (0..count).map { Random().nextInt(limit) }
}



/**************/
/* try it out */
/**************/

fun main(args: Array<String>) {
    println("3 + 7 = ${add(3, 7)}")
    println("5 - 3 = ${subtract(5, 3)}")
    println("Random numbers: " + chooseRandomNumbers(limit = 73))
}
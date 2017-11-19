package se.webstep.kotlinworkshop.part_2_functions

import java.util.*

/** Traditional function, like in Java */
fun add(first: Int, second: Int): Int {
    return first + second
}

/** One line function, remember the equals sign, no return required */
fun substract(first: Int, second: Int): Int = first - second

/** Function with a default values */
fun chooseRandomNumbers(count: Int = 5, limit: Int = 37): List<Int> {
    return (0..count).map { Random().nextInt(limit) }
}

/** Function that takes as arguments a String and two function to apply to it */
fun doStuffWithString(s: String, first: (String) -> String, second: (String) -> String): String {
    return second(first(s))
}

/** Function that calls doStuffWithString with a given string and two functions */
fun capitalizeAndAussify(word: String) = doStuffWithString(word, String::capitalize, { s -> s + ", mate" })

fun main(args: Array<String>) {
    println(add(3, 7))
    println(substract(5, 3))
    println(chooseRandomNumbers(limit = 73))
    println(capitalizeAndAussify("hello"))
}
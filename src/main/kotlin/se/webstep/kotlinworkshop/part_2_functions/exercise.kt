package se.webstep.kotlinworkshop.part_2_functions

/**
 * Create a function concat that concatenates two strings
 */
fun concat(s1: String, s2: String) = s1 + s2

/**
 * Create a function concatDefaults that concatenates two strings (s1 and s2) defaulting to "Point" and "less"
 */
fun concatDefaults(s1: String = "Point", s2: String = "less"): String {
    return concat(s1, s2)
}

/**
 * Create a function mangleNumbers with the following arguments:
 * - two numbers
 * - a function that takes two numbers and returns a number. It should be applied to the first two arguments and return the result
 * - a function that takes one number and returns a number. It should be applied to the result of the first function and return the result
 * The function should return the result of the second function
 */
fun mangleNumbers(x: Int, y: Int, first: (Int, Int) -> Int, then: (Int) -> Int): Int {
    val doThis = first(x, y)
    val thenThis = then(doThis)
    return thenThis
}

/**
 * Create a function concatenator that:
 * - takes a string as argument
 * - returns a function that takes another string and returns both strings concatenated
 */
fun concatenator(s1: String): (String) -> String = { s2 -> concat(s1, s2)}
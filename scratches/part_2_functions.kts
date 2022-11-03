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

/**************/
/* try it out */
/**************/

//println("3 + 7 = ${add(3, 7)}")
//println("5 - 3 = ${subtract(5, 3)}")





















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

println("Random numbers: ${chooseRandomNumbers(limit = 73)}")

/**************/
/* Exercise!  */
/**************/































/**************************/
/* higher order functions */
/**************************/

/**
 * Functions can be send as arguments to other functions and be used as return values.
 */

/** Functions as arguments */

// Function that takes as arguments a String and two function to apply to it
fun doStuffWithString(s: String, f: (String) -> String, g: (String) -> String): String {
    return g(f(s))
}

// Functions that calls doStuffWithString with a given string and two functions
fun capitalizeAndAussify(word: String) = doStuffWithString(word, String::capitalize, { s -> "$s, mate" })

fun trumpifyAndReverse(word: String) = doStuffWithString(word, { s -> "$s America first" }, String::reversed)

/**************/
/* try it out */
/**************/

println("""capitalizeAndAussify("hello"): ${capitalizeAndAussify("hello")}""")

println("""trumpifyAndReverse("Who said")): ${trumpifyAndReverse("Who said")}""")

















/** Functions that return functions */

// function that takes two numbers and returns their sum (ok this function does not return a function)
fun addVersion1(x: Int, y: Int) = x + y

// function that takes an number and returns a function that takes a number and returns their sum
fun addVersion2(x: Int): (Int) -> Int = { y -> x + y }

// function that returns...I don't know
fun addVersion3(): (Int) -> (Int) -> (Int) = { x -> { y -> x + y } }


/** Currying is a way to split a function's arguments in multiple brackets by using partial functions */

val result1 = addVersion1(4, 5)
val result2 = addVersion2(4)(5)
val result3 = addVersion3()(4)(5)

val add10 = addVersion2(10)
val fifteen = add10(5)
val rangePlus10 = (0..10).map { add10(it) }


/**************/
/* try it out */
/**************/

//println("rangeTimes10: " + rangePlus10)

/**************/
/* Exercise!  */
/**************/
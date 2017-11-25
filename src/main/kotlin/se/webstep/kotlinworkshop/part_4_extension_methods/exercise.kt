package se.webstep.kotlinworkshop.part_4_extension_methods

interface Alien {
    val name: String
}

/**
 * There are three kinds of aliens. All have names and another attribute:
 * - Flurps have legs
 * - Glurps have arms
 * - Klurps have heads
 */
data class Flurp(override val name: String, val legs: Int) : Alien
data class Glurp(override val name: String, val arms: Int) : Alien
data class Klurp(override val name: String, val heads: Int) : Alien

/**
 * Flurps, Glurps and Klurps can mutate into Glurps, Klurps and Flurps.
 * When they mutate, their names stay the same, with the addition of 
 * their former mutation. Their arms, legs and heads turn into other 
 * attributes and their number also changes, according to this scheme:
 * 
 * from  | to    |  number
 * ---------------------------
 * Flurp | Glurp | half
 * Flurp | Klurp | times two
 * Glurp | Flurp | minus one
 * Glurp | Klurp | times three
 * Klurp | Flurp | 5
 * Klurp | Glurp | 3
 *
 * So for example:
 * If a Flurp named "Janne" with 6 legs mutates into a Glurp,
 * it would be named "JanneExFlurp" and would have 3 arms.
 *
 * If a Klurp named "Bertil" with 2 heads mutates into a Flurp,
 * it would be named "BertilExKlurp" and would have 5 legs.
 *  
 * Implement extension methods to support these mutations,
 * according to the scheme.
 */
fun Flurp.toGlurp() = Glurp(name + "ExFlurp", legs / 2)
fun Flurp.toKlurp() = Klurp(name + "ExFlurp", legs * 2)
fun Glurp.toFlurp() = Flurp(name + "ExGlurp", arms - 1)
fun Glurp.toKlurp() = Klurp(name + "ExGlurp", arms * 3)
fun Klurp.toFlurp() = Flurp(name + "ExKlurp", 5)
fun Klurp.toGlurp() = Glurp(name + "ExKlurp", 3)
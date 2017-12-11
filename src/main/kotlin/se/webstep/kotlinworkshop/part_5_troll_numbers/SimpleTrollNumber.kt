package se.webstep.kotlinworkshop.part_5_troll_numbers

/**
 * A class that allows creating simple troll numbers, given their numeric value
 *
 * For more complex troll numbers, see [ComplexTrollNumber] and [TrollNumber.minus].
 *
 * For parsing troll numbers from strings, see [toTrollNumber]
 *
 * @property value The numeric value to use for the troll number. Allowed values are 1, 2, 3, 4 and 16.
 * @constructor Create a simple troll number given its numeric value
 */
data class SimpleTrollNumber(override val value: Int) : TrollNumber {

    /** The string representation of this complex troll number */
    override fun toString(): String {
        return when (value) {
            1 -> "one"
            2 -> "two"
            3 -> "three"
            4 -> "many"
            16 -> "lots"
            else -> "unknown"
        }
    }
}

/** The simple troll number one, with the value of 1 */
val one = SimpleTrollNumber(1)
/** The simple troll number two, with the value of 2 */
val two = SimpleTrollNumber(2)
/** The simple troll number three, with the value of 3 */
val three = SimpleTrollNumber(3)
/** The simple troll number many, with the value of 4 */
val many = SimpleTrollNumber(4)
/** The simple troll number lots, with the value of 16 */
val lots = SimpleTrollNumber(16)
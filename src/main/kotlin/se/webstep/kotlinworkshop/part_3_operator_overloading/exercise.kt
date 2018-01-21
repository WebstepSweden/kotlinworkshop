package se.webstep.kotlinworkshop.part_3_operator_overloading

class Fraction(val numerator: Int, val denominator: Int) {
    init {
        if (denominator == 0) {
            throw IllegalArgumentException("Division by zero")
        }
    }

    override fun toString(): String = "$numerator/$denominator"

    fun value(): Double = this.numerator.toDouble() / this.denominator.toDouble()
}

/**
 * implement operator Fraction.plus that takes a second Fraction and adds them together
 *
 * Just as a reminder, adding fractions works like this:
 * a/x + b/y = (ay + bx)/xy
 */
operator fun Fraction.plus(other: Fraction): Fraction {
    val num = (this.numerator * other.denominator) + (other.numerator * this.denominator)
    val denom = this.denominator * other.denominator
    return Fraction(num, denom)
}

/** implement an operator on Int that takes a Fraction and adds them */
operator fun Int.plus(fraction: Fraction): Fraction =
        Fraction(this * fraction.denominator + fraction.numerator, fraction.denominator)

/** implement an operator on Fraction that takes an Int and adds them */
operator fun Fraction.plus(int: Int): Fraction = int + this
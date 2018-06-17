package se.webstep.kotlinworkshop.part_3_operator_overloading

class Fraction(val numerator: Int, val denominator: Int) {
    init {
        require(denominator != 0) { "Division by zero" }
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


/** implement an operator on Int that takes a Fraction and adds them */


/** implement an operator on Fraction that takes an Int and adds them */

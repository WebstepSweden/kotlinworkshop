package se.webstep.kotlinworkshop

class Fraction(val numerator: Int, val denominator: Int) {
    override fun toString(): String = "$numerator/$denominator"
}

operator fun Fraction.plus(other: Fraction): Fraction {
    val num = (this.numerator * other.denominator) + (other.numerator * this.denominator)
    val denom = this.denominator * other.denominator
    return Fraction(num, denom)
}

operator fun Int.plus(fraction: Fraction): Fraction =
        Fraction(this * fraction.denominator + fraction.numerator, fraction.denominator)

operator fun Fraction.plus(int: Int): Fraction = int + this
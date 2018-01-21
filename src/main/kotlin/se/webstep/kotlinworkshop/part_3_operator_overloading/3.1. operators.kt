package se.webstep.kotlinworkshop.part_3_operator_overloading

/************************/
/* operator overloading */
/************************/

/**
 * Operators such as -, + and * can be overridden to be used in your own classes,
 * by defining function that begin with the keyword operator and defining a function
 * with the corresponding name, such as minus, plus and times.
 */

data class ComplexNumber(val real: Int, val imaginary: Int) {
    override fun toString(): String = "($real + $imaginary" + "i)"
}

/**
 * Define an addition operator to ComplexNumber which takes another ComplexNumber and adds them
 * complex number addition: (a + bi) + (c + di) = ((a + c) + (b + d)i)
 */
operator fun ComplexNumber.plus(other: ComplexNumber) =
        ComplexNumber(this.real + other.real, this.imaginary + other.imaginary)

/** subtraction: (a + bi) - (c + di) = ((a - c) + (b - d)i) */
operator fun ComplexNumber.minus(other: ComplexNumber) =
        ComplexNumber(this.real - other.real, this.imaginary - other.imaginary)

/** multiplication: (a + bi) * (c + di) = ((ac - bd) + (bc + ad)i) */
operator fun ComplexNumber.times(other: ComplexNumber): ComplexNumber {
    val ac = this.real * other.real
    val bd = this.imaginary * other.imaginary
    val bc = this.imaginary * other.real
    val ad = this.real * other.imaginary
    return ComplexNumber(ac - bd, bc + ad)
}

/**************/
/* try it out */
/**************/

fun main(args: Array<String>) {
    val complex_1_2 = ComplexNumber(1, 2)
    val complex_3_4 = ComplexNumber(3, 4)

    println("complex_1_2: ${complex_1_2}")
    println("complex_3_4: ${complex_3_4}")

    println("${complex_1_2} + ${complex_3_4} = ${complex_1_2 + complex_3_4}")
    println("${complex_3_4} - ${complex_1_2} = ${complex_3_4 - complex_1_2}")
    println("${complex_1_2} * ${complex_3_4} = ${complex_1_2 * complex_3_4}")
}
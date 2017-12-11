package se.webstep.kotlinworkshop.part_5_troll_numbers

/**
 * An extension method to create troll numbers from a string.
 *
 * Examples:
 * * "one".toTrollNumber() => one
 * * "many-two".toTrollNumber() => many-two
 * * "lots".toTrollNumber() => lots
 */
fun String.toTrollNumber(): TrollNumber {
    if (this.contains("-")) {
        val split = this.split("-")
        val trollNumbers = split.map { s -> s.toTrollNumber() }
        return ComplexTrollNumber(trollNumbers)
    }

    return when (this) {
        "one" -> one
        "two" -> two
        "three" -> three
        "many" -> many
        "lots" -> lots
        else -> throw IllegalArgumentException("Unknown troll number")
    }
}

/**
 * An extension method to create a troll number from an integer.
 *
 * Examples:
 * * 3.toTrollNumber() => three
 * * 5.toTrollNumber() => many-one
 * * 11.toTrollNumber() => many-many-three
 */
fun Int.toTrollNumber(): TrollNumber {
    return when (this) {
        1 -> one
        2 -> two
        3 -> three
        4 -> many
        16 -> lots
        else -> {
            val noOfManys = this / 4
            val manys = MutableList(noOfManys) { many }

            val rest = this % 4
            if (rest > 0) {
                val simple = SimpleTrollNumber(rest)
                manys.add(simple)
            }
            return ComplexTrollNumber(manys)
        }
    }
}

/**
 * A way to construct complex troll numbers using the minus sign.
 *
 * Examples:
 * * many-one => many-one
 * * many-many-three => many-many-three
 * * many-many-many-two => many-many-many-two
 */
operator fun TrollNumber.minus(other: TrollNumber): TrollNumber = ComplexTrollNumber(listOf(this, other))

/**
 * Add two troll numbers to create a new one.
 *
 * Examples:
 * * one + one => two
 * * many + two => many-two
 * * (many-one) + (many-one) => many-many-two // yeah, without the brackets that just wouldn't work, sorry
 */
operator fun TrollNumber.plus(other: TrollNumber): TrollNumber = (this.value + other.value).toTrollNumber()
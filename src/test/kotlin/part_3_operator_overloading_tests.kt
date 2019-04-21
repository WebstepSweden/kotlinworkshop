import io.kotlintest.Matcher
import io.kotlintest.Result
import io.kotlintest.should
import io.kotlintest.shouldBe
import io.kotlintest.shouldThrow
import io.kotlintest.specs.ShouldSpec
import io.kotlintest.specs.StringSpec
import se.webstep.kotlinworkshop.part_3_operator_overloading.Fraction
//import se.webstep.kotlinworkshop.part_3_operator_overloading.plus

private val half = Fraction(1, 2)
private val third = Fraction(1, 3)


class FractionCreationTests : StringSpec({
    "Fraction toString() should look ok" {
        third.toString() shouldBe "1/3"
    }

    "Fraction value should be correct" {
        half.value() shouldBe 0.5
    }

    "Fraction with zero denominator" {
        shouldThrow<IllegalArgumentException> {
            Fraction(8, 0)
        }
    }
})

/*
class FractionAdditionTests : ShouldSpec({
    "Adding two fractions" {
        should("result in correct new fraction") {
            half + third should haveSameNumeratorAndDenominator(Fraction(5, 6))
        }
    }

    "Adding int to fraction" {
        should("result in correct new fraction") {
            4 + third should haveSameNumeratorAndDenominator(Fraction(13, 3))
        }
    }

    "Adding fraction to int" {
        should("result in correct new fraction") {
            half + 2 should haveSameNumeratorAndDenominator(Fraction(5, 2))
        }
    }
})
*/

// custom matcher to compare two Fractions based on their numerator and denominator
fun haveSameNumeratorAndDenominator(fraction: Fraction) = object : Matcher<Fraction> {
    override fun test(value: Fraction) = Result(
            fraction.numerator == value.numerator && fraction.denominator == value.denominator,
            "Fraction $fraction should have same properties as $value",
            "Fraction $fraction should not have same properties as $value")
}


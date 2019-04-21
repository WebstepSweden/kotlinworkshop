import io.kotlintest.shouldBe
import io.kotlintest.shouldThrow
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.forAll
import io.kotlintest.tables.headers
import io.kotlintest.tables.row
import io.kotlintest.tables.table
import se.webstep.kotlinworkshop.part_5_troll_numbers.SimpleTrollNumber
import se.webstep.kotlinworkshop.part_5_troll_numbers.lots
import se.webstep.kotlinworkshop.part_5_troll_numbers.many
import se.webstep.kotlinworkshop.part_5_troll_numbers.minus
import se.webstep.kotlinworkshop.part_5_troll_numbers.one
import se.webstep.kotlinworkshop.part_5_troll_numbers.plus
import se.webstep.kotlinworkshop.part_5_troll_numbers.three
import se.webstep.kotlinworkshop.part_5_troll_numbers.toTrollNumber
import se.webstep.kotlinworkshop.part_5_troll_numbers.two


class SimpleTrollNumberTest : StringSpec({

    "Constants should have correct values" {
        val table = table(
                headers("constant", "expected value"),
                row(one, 1),
                row(two, 2),
                row(three, 3),
                row(many, 4),
                row(lots, 16)
        )

        forAll(table) { constant, expectedValue ->
            constant.value shouldBe expectedValue
        }
    }

    "Constants should have correct toString() value" {
        val table = table(
                headers("constant", "value"),
                row(one, "one"),
                row(two, "two"),
                row(three, "three"),
                row(many, "many"),
                row(lots, "lots"),
                row(SimpleTrollNumber(42), "unknown")
        )

        forAll(table) { constant, expectedToString ->
            constant.toString() shouldBe expectedToString
        }
    }

    "String parsing should give correct constant" {
        val table = table(
                headers("string", "constant"),
                row("one", one),
                row("two", two),
                row("three", three),
                row("many", many),
                row("lots", lots)
        )

        forAll(table) { string, expectedConstant ->
            string.toTrollNumber().value shouldBe expectedConstant.value
            string.toTrollNumber().toString() shouldBe expectedConstant.toString()
        }
    }

    "Parsing wrong stuff should throw exception" {
        shouldThrow<IllegalArgumentException> {
            "five".toTrollNumber()
        }
    }
})



class ComplexTrollNumberTest : StringSpec({

    "String parsing should give correct value" {
        val table = table(
                headers("string", "expected value"),
                row("many-two", 6),
                row("many-many-three", 11),
                row("many", many.value),
                row("many-many-many-many", lots.value),
                row("lots", lots.value)
        )

        forAll(table) { string, expectedValue ->
            string.toTrollNumber().value shouldBe expectedValue
        }
    }

    "Parsing complex numbers should give correct toString() value" {
        val table = table(
                headers("complex number", "value"),
                row("many-one", "many-one"),
                row("many-many", "many-many"),
                row("many-many-three", "many-many-three"))

        forAll(table) { string, expectedToString ->
            string.toTrollNumber().toString() shouldBe expectedToString
        }
    }

    "Creating complex troll numbers should work properly" {
        val five = many - one
        val fourteen = many - many - many - two

        five.toString() shouldBe "many-one"
        fourteen.toString() shouldBe "many-many-many-two"

        five.value shouldBe 5
        fourteen.value shouldBe 14
    }
})



class TrollNumberUtilsTest : StringSpec({

    "Creating troll numbers from integers should generate correct troll numbers" {
        val three = 3.toTrollNumber()
        val five = 5.toTrollNumber()
        val eleven = 11.toTrollNumber()

        three.toString() shouldBe "three"
        five.toString() shouldBe "many-one"
        eleven.toString() shouldBe "many-many-three"
    }

    "Adding two troll numbers should generate correct complex troll numbers" {
        val two = one + one
        val five = many + one
        val fifteen = many - many - many + three
        val ten = (many - one) + (many - one)

        two.value shouldBe 2
        five.value shouldBe 5
        fifteen.value shouldBe 15
        ten.value shouldBe 10

        two.toString() shouldBe "two"
        five.toString() shouldBe "many-one"
        fifteen.toString() shouldBe "many-many-many-three"
        ten.toString() shouldBe "many-many-two"
    }
})

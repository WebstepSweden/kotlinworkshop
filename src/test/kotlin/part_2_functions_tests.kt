/*

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec
import se.webstep.kotlinworkshop.part_2_functions.concat
import se.webstep.kotlinworkshop.part_2_functions.concatDefaults
import se.webstep.kotlinworkshop.part_2_functions.concatenator
import se.webstep.kotlinworkshop.part_2_functions.mangleNumbers

class ConcatenateTests : StringSpec({
    "Hello and World should be Hello World" {
        concat("Hello ", "World") shouldBe "Hello World"
    }
})

class ConcatenateDefaultTests : StringSpec({
    "Using defaults should be Pointless" {
        concatDefaults() shouldBe "Pointless"
    }

    "Heart and default should be Heartless" {
        concatDefaults(s1 = "Heart") shouldBe "Heartless"
    }

    "default and blank should be Point blank" {
        concatDefaults(s2 = " blank") shouldBe "Point blank"
    }
})

class MangleNumbersTests : StringSpec({
    "(2 + 4) * 5 should be 30" {
        mangleNumbers(2, 4, Int::plus, { it * 5 }) shouldBe 30
    }

    "3 * 4 + 10 should be 22" {
        mangleNumbers(3, 4, Int::times, { it + 10 }) shouldBe 22
    }

    "81 / 9 / 3 should be 3" {
        mangleNumbers(81, 9, Int::div, { it / 3 }) shouldBe 3
    }
})

class PartialConcatTests : StringSpec({
    "partial function fooConcatenator should concatenate correctly" {
        val fooConcatenator = concatenator("Foo")
        fooConcatenator("bar") shouldBe "Foobar"
        fooConcatenator(" Fighters") shouldBe "Foo Fighters"
    }
})

*/
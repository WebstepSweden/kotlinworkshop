import io.kotlintest.Matcher
import io.kotlintest.Result
import io.kotlintest.should
import io.kotlintest.specs.StringSpec
//import se.webstep.kotlinworkshop.part_4_extension_methods.Alien
//import se.webstep.kotlinworkshop.part_4_extension_methods.Flurp
//import se.webstep.kotlinworkshop.part_4_extension_methods.Glurp
//import se.webstep.kotlinworkshop.part_4_extension_methods.Klurp
//import se.webstep.kotlinworkshop.part_4_extension_methods.toFlurp
//import se.webstep.kotlinworkshop.part_4_extension_methods.toGlurp
//import se.webstep.kotlinworkshop.part_4_extension_methods.toKlurp

/*
class AlienTests : StringSpec({
    val kalle = Flurp("Kalle", 4)
    val lasse = Glurp("Lasse", 6)
    val danne = Klurp("Danne", 3)

    "Flurp -> Glurp" {
        kalle.toGlurp() should beTheSameAlienAs(Glurp("KalleExFlurp", 2))
    }

    "Flurp -> Klurp" {
        kalle.toKlurp() should beTheSameAlienAs(Klurp("KalleExFlurp", 8))
    }

    "Glurp -> Flurp" {
        lasse.toFlurp() should beTheSameAlienAs(Flurp("LasseExGlurp", 5))
    }

    "Glurp -> Klurp" {
        lasse.toKlurp() should beTheSameAlienAs(Klurp("LasseExGlurp", 18))
    }

    "Klurp -> Flurp" {
        danne.toFlurp() should beTheSameAlienAs(Flurp("DanneExKlurp", 5))
    }

    "Klurp -> Glurp" {
        danne.toGlurp() should beTheSameAlienAs(Glurp("DanneExKlurp", 3))
    }

    "Flurp -> Glurp -> Klurp" {
        kalle.toGlurp().toKlurp() should beTheSameAlienAs(Klurp("KalleExFlurpExGlurp", 6))
    }

    "Glurp -> Klurp -> Flurp" {
        lasse.toKlurp().toFlurp() should beTheSameAlienAs(Flurp("LasseExGlurpExKlurp", 5))
    }

    "Glurp -> Klurp -> Flurp -> Klurp -> Glurp -> Flurp -> Klurp" {
        lasse.toKlurp().toFlurp().toKlurp().toGlurp().toFlurp().toKlurp() should beTheSameAlienAs(
                Klurp("LasseExGlurpExKlurpExFlurpExKlurpExGlurpExFlurp", 4)
        )
    }
})
*/

// custom matcher to compare two Aliens based on their names and number of legs, hands or heads
//fun beTheSameAlienAs(alien: Alien) = object : Matcher<Alien> {
//    override fun test(value: Alien) = Result(
//            alien::class == value::class &&
//                    alien.name == value.name &&
//                    numbersAreTheSame(alien, value),
//            "Alien $alien should have same properties as $value",
//            "Alien $alien should not have same properties as $value")
//}

// help function that compares the number of legs, hands and heads
//fun numbersAreTheSame(alien: Alien, value: Alien): Boolean {
//    return when (value) {
//        is Flurp -> (alien as Flurp).legs == value.legs
//        is Glurp -> (alien as Glurp).arms == value.arms
//        else -> (alien as Klurp).heads == (value as Klurp).heads
//    }
//}


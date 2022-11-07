import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.Matcher
import io.kotest.matchers.MatcherResult
import io.kotest.matchers.comparables.gte
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe
//import se.webstep.kotlinworkshop.part_1_classes_and_objects.Food
//import se.webstep.kotlinworkshop.part_1_classes_and_objects.Kitchen

/*
class FoodTests : StringSpec({
    "Constructor with all arguments should work ok" {
        val lemon = Food("Lemon", "sour")
        lemon.name shouldBe "Lemon"
        lemon.taste shouldBe "sour"
    }

    "Constructor with default argument value should work ok" {
        val banana = Food("Banana")
        banana.name shouldBe "Banana"
        banana.taste shouldBe "sweet"
    }

    "Constructor with named arguments should work ok" {
        val lychee = Food(taste = "strange", name = "Lychee")
        lychee.name shouldBe "Lychee"
        lychee.taste shouldBe "strange"
    }
})
*/

/*
class KitchenTests : StringSpec({
    "Salad should have at least three ingredients" {
        Kitchen.createSalad().size shouldBe gte(3)
    }

    "Salad should have at least one spicy ingredient" {
        Kitchen.createSalad() should containIngredientWithTaste("spicy")
    }
})
*/

// custom matcher to see if a list of foods contains one with given taste
/*
fun containIngredientWithTaste(taste: String) = object : Matcher<List<Food>> {
    override fun test(value: List<Food>) = MatcherResult(
        value.any { it.taste == taste },
        { "Food must contain something that is $taste" },
        { "Food must not contain something that is $taste" }
    )
}
*/
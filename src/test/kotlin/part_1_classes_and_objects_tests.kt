import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec
import se.webstep.kotlinworkshop.Food

class FoodCreationTests : StringSpec({
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
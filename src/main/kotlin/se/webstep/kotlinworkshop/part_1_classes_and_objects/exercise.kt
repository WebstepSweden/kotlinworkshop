package se.webstep.kotlinworkshop.part_1_classes_and_objects

/**
 * Define a class named Food with a mandatory name and a taste which defaults to "sweet".
 * The taste field should be changeable
 */
class Food(val name: String, var taste: String = "sweet")

/**
 * Define an object Kitchen with function createSalad which return a list of at least three ingredients (Foods),
 * of which at least one is spicy
 */
object Kitchen {
    fun createSalad(): List<Food> {
        return listOf(Food("Tomato", "squishy"),
                Food("Cucumber", "watery"),
                Food("Pepper", "spicy"))
    }
}
package se.webstep.kotlinworkshop.part_5_troll_numbers

/**
 * Troll have issues with numbers. Therefore, the count like that:
 *
 * one, two, three, many
 * many-one, many-two, many-three, many-many
 * many-many-one, many-many-two, many-many-three, many-many-many
 * many-many-many-one, many-many-many-two, many-many-many-three, lots
 *
 * So, the whole numeric system is consisted of five different words. These are:
 * one, two, three, many and lots
 *
 * Simple troll numbers use one word, such as one, many or lots
 * Complex troll numbers use several words, such as many-two or many-many-three
 *
 * Troll numbers have a getter to retrieve their numeric value:
 * three.value // 3
 * many-two.value // 6
 *
 * Also, they have a toString() implementation:
 * many-many.toString() // many-many
 * three.toString() // three
 *
 * Troll numbers can be created from strings, e g:
 * "two".toTrollNumber() // two
 * "many-many-three".toTrollNumber() // many-many-three
 *
 * Also, they can be created from numbers, e g:
 * 3.toTrollNumber() // three
 * 15.toTrollNumber() // many-many-many-three
 *
 * Lastly, they can be added to each other, like that:
 * many-one + three // many-many
 * two + three // many-one
 *
 * This exercise uses many of the stuff we went through, such as classes, functions, operator overloading,
 * extension methods etc.
 *
 * Implement troll numbers and make the tests green!
 */
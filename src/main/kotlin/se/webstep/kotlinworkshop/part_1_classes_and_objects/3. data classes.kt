package se.webstep.kotlinworkshop.part_1_classes_and_objects

/****************/
/* Data Classes */
/****************/

/**
 * Running javap for a class, this is what been generated:
 * - class definition
 * - getters
 * - constructor
 */
class Dog(val name: String, val barksalot: Boolean)
/*
$ javap se/webstep/kotlinworkshop/part_1_classes_and_objects/Dog.class
Compiled from "1. classes.kt"
public final class se.webstep.kotlinworkshop.part_1_classes_and_objects.Dog {
  public final java.lang.String getName();
  public final boolean getBarksalot();
  public se.webstep.kotlinworkshop.part_1_classes_and_objects.Dog(java.lang.String, boolean);
}
*/

/**
 * Running javap for a data class, this is what been generated:
 * - class definition
 * - getters
 * - constructor
 * - methods component1() and component2(), used for creating a Pair
 * - copy methods
 * - toString()
 * - hashCode()
 * - equals()
 */
data class Cat(val name: String, val lives: Int)
/*
$ javap se/webstep/kotlinworkshop/part_1_classes_and_objects/Cat.class
Compiled from "1. classes.kt"
public final class se.webstep.kotlinworkshop.part_1_classes_and_objects.Cat {
  public final java.lang.String getName();
  public final int getLives();
  public se.webstep.kotlinworkshop.part_1_classes_and_objects.Cat(java.lang.String, int);
  public final java.lang.String component1();
  public final int component2();
  public final se.webstep.kotlinworkshop.part_1_classes_and_objects.Cat copy(java.lang.String, int);
  public static se.webstep.kotlinworkshop.part_1_classes_and_objects.Cat copy$default(se.webstep.kotlinworkshop.part_1_classes_and_objects.Cat, java.lang.String, int, int, java.lang.Object);
  public java.lang.String toString();
  public int hashCode();
  public boolean equals(java.lang.Object);
*/


/**************/
/* try it out */
/**************/

fun main(args: Array<String>) {
    println(Dog("Joshua", true))
    println(Cat("Berit", 9))
}

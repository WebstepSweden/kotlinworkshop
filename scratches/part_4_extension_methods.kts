/*********************/
/* extension_methods */
/*********************/

/**
 * Extension methods add functionality to existing classes.
 * They are often used to convert between different classes.
 * They look like that:
 * fun KnownClass.newFunction() = implementation
 */

data class Person(val name: String)

/** An extension method to String that creates an instance of class Person */
fun String.toPerson() = Person(this)

data class ComplexNumber(val real: Int, val imaginary: Int) {
    override fun toString(): String = "($real + ${imaginary}i)"
}

/** An extension method to Int that creates a ComplexNumber */
fun Int.toComplexNumber() = ComplexNumber(this, 0)

/**************/
/* try it out */
/**************/

//val bertil = "Bertil Bertilsson".toPerson()
//println(bertil)
//println(8.toComplexNumber())

/**************/
/* Exercise!  */
/**************/
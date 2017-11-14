import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.hamcrest.Matchers.samePropertyValuesAs
import org.junit.jupiter.api.Test
import se.webstep.kotlinworkshop.Fraction
import se.webstep.kotlinworkshop.plus

class FractionTest {
    private val half = Fraction(1, 2)
    private val third = Fraction(1, 3)

    @Test
    fun fraction_toString_should_look_good() {
        assertThat(third.toString(), equalTo("1/3"))
    }

    @Test // 1/2 + 1/3 = 5/6
    fun adding_two_fractions_should_result_in_correct_new_fraction() {
        assertThat(half + third, samePropertyValuesAs(Fraction(5, 6)))
    }

    @Test // 4 + 1/3 = 13/3
    fun adding_int_to_fraction_should_result_in_correct_new_fraction() {
        assertThat(4 + third, samePropertyValuesAs(Fraction(13, 3)))
    }

    @Test // 1/2 + 2 = 5/2
    fun adding_fraction_to_int_should_result_in_correct_new_fraction() {
        assertThat(half + 2, samePropertyValuesAs(Fraction(5, 2)))
    }
}


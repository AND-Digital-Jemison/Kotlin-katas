import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MumblingTest {

    @Test
    fun `1- Initial test - return empty string`(){
        val game = Mumbling()
        val actual = game.getString("")
        kotlin.test.assertEquals(
            "",
            actual
        )
    }

    @Test
    fun `2- return character that was passed inside the function`(){
        val game = Mumbling()
        val actual = game.getString("a")
        kotlin.test.assertEquals(
            "a",
            actual
        )
    }

    @Test
    fun `3- add dash behind the letters if more than 2 letter received`(){
        val game = Mumbling()
        val actual = game.getString("ab")
        kotlin.test.assertEquals(
            "a-bb-",
            actual
        )
    }
// originally this test returned "a-b-" but because of net change in adding numbers to it
// it needs to be changed? is that allowed ????
// changed to "a-bb-"

    @Test
    fun `4- add amount of letters based on its position in string`(){
        val game = Mumbling()
        val actual = game.getString("abc")
        kotlin.test.assertEquals(
            "a-bb-ccc-",
            actual
        )
    }

    @Test
    fun `5- add capital letter on the beginning position`(){
        val game = Mumbling()
        val actual = game.getStringCapital("abCd")
        kotlin.test.assertEquals(
            "A-Bb-Ccc-Dddd-",
            actual
        )
    }

    @Test
    fun `6- remove the last dash`(){
        val game = Mumbling()
        val actual = game.getStringCapitalRemoveLastDash("abCd")
        kotlin.test.assertEquals(
            "A-Bb-Ccc-Dddd",
            actual
        )
    }
}
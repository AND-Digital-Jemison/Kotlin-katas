import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.test.*

internal class MumblingTest {

    @Test
    fun `Initial test - return empty string`(){
        val game = Mumbling()
        val actual = game.getString("")
        kotlin.test.assertEquals(
            "",
            actual
        )
    }

    @Test
    fun `return character that was passed inside the function`(){
        val game = Mumbling()
        val actual = game.getString("a")
        kotlin.test.assertEquals(
            "a",
            actual
        )
    }

    @Test
    fun `add dash behind the letters if more than 2 letter received`(){
        val game = Mumbling()
        val actual = game.getString("ab")
        kotlin.test.assertEquals(
            "a-b-",
            actual
        )
    }

    @Test
    fun `add amount of letters based on its position in string`(){
        val game = Mumbling()
        val actual = game.getString("abc")
        kotlin.test.assertEquals(
            "a-bb-ccc-",
            actual
        )
    }

}
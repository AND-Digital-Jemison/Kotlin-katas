import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class TicTacToeTest {

    @Test
    fun DefaultFail() {

        val myClass = TicTacToe()

        //assertEquals ( expected , actual )
        assertEquals(1,myClass.giveMeValue())
    }




}
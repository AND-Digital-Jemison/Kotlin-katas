import org.junit.jupiter.api.Test
import kotlin.test.*


internal class TicTacToeTest {

    @Test
    fun OnGameStart_EmptyBoard(){
        val game = TicTacToe()
        val actual = game.getBoard()
        assertEquals("""###
###
###""",
            actual
        )
    }

    @Test
    fun `Player 1 makes his 1 Move` (){
        val game = TicTacToe()
        game.playerMoves(2,1)
        val actual = game.getBoard()
        assertEquals("""###
x##
###""",
            actual
        )
    }

//    @Test
//    fun TwoMoves(){
//        val game = TicTacToe()
//        game.playerMoves(1,0)
//        game.playerMoves(1,1)
//        val actual = game.getBoard()
//        assertEquals("""###
//xo#
//###""",
//            actual
//        )
//    }

//    @Test
//    fun CheckinitialGrid() {
//
//        val myClass = TicTacToe()
//        assertContains([0,0,0,0,0,0,0,0,0],Int,myClass.initializeGrid())
//    }


}
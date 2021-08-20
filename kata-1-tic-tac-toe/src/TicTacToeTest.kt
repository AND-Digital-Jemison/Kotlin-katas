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
    fun `Player 1 makes move 1,1` (){
        val game = TicTacToe()
        game.playerMoves(1,1)
        val actual = game.getBoard()
        assertEquals("""###
#x#
###""",
            actual
        )
    }

    @Test
    fun `Player 1 makes move 0,1` (){
        val game = TicTacToe()
        game.playerMoves(0,1)
        val actual = game.getBoard()
        assertEquals("""#x#
###
###""",
            actual
        )
    }

    @Test
    fun `Player 1 makes move 0,2` (){
        val game = TicTacToe()
        game.playerMoves(0,2)
        val actual = game.getBoard()
        assertEquals("""##x
###
###""",
            actual
        )
    }

    @Test
    fun `Player 1 makes move 2,1` (){
        val game = TicTacToe()
        game.playerMoves(2,1)
        val actual = game.getBoard()
        assertEquals("""###
###
#x#""",
            actual
        )
    }

    @Test
    fun `Player 1 makes move 0,0` (){
        val game = TicTacToe()
        game.playerMoves(0,0)
        val actual = game.getBoard()
        assertEquals("""x##
###
###""",
            actual
        )
    }

    @Test
    fun `Player 1 makes move 1,0` (){
        val game = TicTacToe()
        game.playerMoves(1,0)
        val actual = game.getBoard()
        assertEquals("""###
x##
###""",
            actual
        )
    }

    @Test
    fun `Player 1 makes move 1,2` (){
        val game = TicTacToe()
        game.playerMoves(1,2)
        val actual = game.getBoard()
        assertEquals("""###
##x
###""",
            actual
        )
    }

    @Test
    fun `Player 1 makes move 2,0` (){
        val game = TicTacToe()
        game.playerMoves(2,0)
        val actual = game.getBoard()
        assertEquals("""###
###
x##""",
            actual
        )
    }

    @Test
    fun `Player 1 makes move 2,2` (){
        val game = TicTacToe()
        game.playerMoves(2,2)
        val actual = game.getBoard()
        assertEquals("""###
###
##x""",
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
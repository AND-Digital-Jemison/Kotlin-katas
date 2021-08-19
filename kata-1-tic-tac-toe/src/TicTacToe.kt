


class TicTacToe {

    private var board :String =  """###
###
###"""

    fun getBoard() = board

    fun playerMoves(row: Int, col: Int): Unit {
        board = """###
x##
###"""
    }
}

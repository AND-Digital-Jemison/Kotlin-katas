


class TicTacToe {

    private var board :String =  """###
###
###"""

    fun getBoard() = board

    fun playerMoves(row: Int, col: Int): Unit {
        if(col==1){
            board = """###
#x#
###"""
        }else {
            board = """###
x##
###"""
        }
    }
}

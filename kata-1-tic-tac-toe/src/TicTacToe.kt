


class TicTacToe {

    private var board: String = """###
###
###"""

    fun getBoard() = board

    fun playerMoves(row: Int, col: Int): Unit {


        board = if (row == 1 && col == 1) {
            """###
#x#
###"""
        } else if (row == 0 && col == 1) {
            """#x#
###
###"""
        } else if (row == 0 && col == 2) {
            """##x
###
###"""
        } else if(row == 2 && col == 1) {
            """###
###
#x#"""
        }else if(row == 0 && col == 0){
            """x##
###
###"""

        }else if(row == 1 && col ==0) {
            """###
x##
###"""

        }else if (row == 1 && col ==2) {
            """###
##x
###"""

        }else if (row ==2 && col ==0){
            """###
###
x##"""

        }else if(row ==2 && col ==2){
            """###
###
##x"""

        }else{
            """###
###
#x#"""

        }
    }
}


package tictactoe

object Board {
    
    //intitialilzes the board
    def initBoard(dimension: Int): List[Any] = {
        List.range(1, dimension + 1, 1)
    }

    //returns the dimensions of the board
    def returnDimension(board: List[Any]): Int = {
        Math.sqrt(board.length).toInt
    }
    //returns a list of the row lists
    def returnRows(board: List[Any]): List[List[Any]] = {
        val rowNum = returnDimension(board)
        board.grouped(rowNum).toList
    }
    
    //returns a list of column lists
    def returnColumns(board: List[Any]): List[List[Any]] = {
        val colNum = returnDimension(board)
        val boardLen = board.length
        List.range(1, colNum + 1, 1).map(x => List.range(x, boardLen + 1, colNum))
    }

    //returns a list of diagonal lists
    def returnDiagonals(board: List[Any]): List[List[Any]] = {
        val diaLen = returnDimension(board)
        val boardLen = board.length
        val dia1: List[Int] = List.range(1, boardLen + 1, diaLen + 1)
        val dia2: List[Int] = List.range(diaLen, boardLen - 1, diaLen - 1)
        List(dia1, dia2)
    }

    //checks to see if a provided list of lists has a list with identical internal values
    def checkSets(sets: List[List[Any]]): Boolean = {
        val setBooleans = sets.map(set => set.forall(_ == set.head))
        setBooleans.foldLeft(setBooleans(0))(_ || _)
    }

    //returns a boolean, checks diagonals, columns and rows for identical values
    def checkWin(board: List[Any]): Boolean = {
        val diaBool = checkSets(returnDiagonals(board))
        val rowBool = checkSets(returnRows(board))
        val colBool = checkSets(returnColumns(board))
        diaBool || rowBool || colBool
    }

}
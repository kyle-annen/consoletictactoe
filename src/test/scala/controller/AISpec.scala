package tictactoe

import org.scalatest.FunSpec

class AISpec extends FunSpec {

  def testPrint(s: String): String = s

  describe("getComputerMove") {
    it("scores a two move board correctly") {
      val testBoard = List(
        "x","o","x",
        "x","o","x",
        "o","8","9")
      val expectedMove: Int = 8
      val actualMove = AI.getComputerMove(testBoard, "x", "o", "x")
      assert(actualMove === expectedMove)
    }

    it("scores a simple win correctly") {
      val testBoard = List(
        "x","o","x",
        "4","o","x",
        "7","8","9")
      val expected: Int = 8
      val actual = AI.getComputerMove(testBoard, "x", "o", "x")
      assert(actual == expected)
    }

    it("take the appropriate second move") {
      val testBoard = List(
        "o","2","3",
        "4","5","6",
        "7","8","9")
      val expected: Int = 4
      val actual = AI.getComputerMove(testBoard, "x", "o", "x")
      assert(actual == expected)
    }
  }
  it("will tie given every opponent first move") {
    val openBoard = (1 to 9).toList.map(x => x.toString)
    val players = Map(1 -> ("computer", "X"), 2 -> ("computer", "O"))
    val seedBoards = openBoard.map(x => openBoard.map(cell => if(cell == x) "O" else cell ))

    for(board <- seedBoards) {
      val actual = Game.go(board, players, Dialog.lang("EN"), false, 1, testPrint, 0, 0, IO.getInput, 1)
      val expected = Map(2 -> false)

      assert(actual === expected)
    }
  }
}
package by.ivasiuk.leetcode

import java.util.*


/**
 * @see <a href="https://leetcode.com/problems/snakes-and-ladders/">
 *   Snakes and Ladders</a>
 */
class SnakesAndLadders {
  fun snakesAndLadders(board: Array<IntArray>): Int {
    val n = board.size
    var move = 0
    val visited = BooleanArray(n * n + 1)
    val queue = LinkedList<Int>().apply { offer(1) }

    while (queue.isNotEmpty()) {
      for (i in 1..queue.size) {
        val num = queue.pollFirst()

        if (!visited[num]) {
          visited[num] = true

          if (num == n * n) {
            return move
          }

          for (curr in num + 1 until minOf(num + 6, n * n) + 1) {
            val next = getPosition(board, curr).takeIf { it > 0 } ?: curr

            if (!visited[next]) {
              queue.offer(next)
            }
          }
        }
      }

      move++
    }

    return -1
  }

  private fun getPosition(board: Array<IntArray>, num: Int): Int {
    val n = board.size
    val r = (num - 1) / n
    val x = n - 1 - r
    val y = if (r % 2 == 0) num - 1 - r * n else n + r * n - num
    return board[x][y]
  }
}

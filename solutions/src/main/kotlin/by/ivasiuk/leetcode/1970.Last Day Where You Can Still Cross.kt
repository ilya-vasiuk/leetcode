package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/last-day-where-you-can-still-cross/">
 *   Last Day Where You Can Still Cross</a>
 */
class LastDayWhereYouCanStillCross {
  fun latestDayToCross(row: Int, col: Int, cells: Array<IntArray>): Int {
    val map = Array(row) { Array(col) { Int.MAX_VALUE } }

    cells.forEachIndexed { day, (r, c) -> map[r - 1][c - 1] = day }

    val queue = PriorityQueue<Pair<Int, Pair<Int, Int>>>(compareByDescending { it.first })
    val visited = Array(row) { Array(col) { Int.MAX_VALUE } }

    map.last().forEachIndexed { index, value ->
      queue.add(value to (row - 1 to index))
    }

    while (queue.isNotEmpty()) {
      val (maxD, cell) = queue.poll()

      if (visited[cell.first][cell.second] == Int.MAX_VALUE) {
        visited[cell.first][cell.second] = maxD

        DIRECTIONS
          .map { Pair(cell.first + it.first, cell.second + it.second) }
          .forEach { next ->
            if (next.first in 0 until row &&
              next.second in 0 until col &&
              visited[next.first][next.second] == Int.MAX_VALUE) {
              queue.add(minOf(map[next.first][next.second], maxD) to next)
            }
          }
      }
    }

    return visited[0].max()!!
  }

  companion object {
    val DIRECTIONS = setOf(-1 to 0, 0 to -1, 0 to 1, 1 to 0)
  }
}

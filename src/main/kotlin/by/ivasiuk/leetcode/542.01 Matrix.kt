package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/01-matrix/">01 Matrix</a>
 */
class Matrix01 {
  fun updateMatrix(mat: Array<IntArray>): Array<IntArray> {
    val visited = mutableSetOf<Pair<Int, Int>>()
    val queue = LinkedList<Triple<Int, Int, Int>>()
    val m = mat.size
    val n = mat[0].size

    for (i in 0 until m) {
      for (j in 0 until n) {
        val cell = mat[i][j]

        if (cell == 0) {
          queue.add(Triple(i, j, 0))
          visited.add(Pair(i, j))
        }
      }
    }

    while (queue.isNotEmpty()) {
      val (i, j, distance) = queue.poll()

      direction.forEach { dir ->
        val di = i + dir.first
        val dj = j + dir.second
        val next = Pair(di, dj)

        if (di in 0 until m && dj in 0 until n && !visited.contains(next)) {
          visited.add(next)
          mat[di][dj] = distance + 1
          queue.add(Triple(di, dj, mat[di][dj]))
        }
      }
    }

    return mat
  }

  companion object {
    private val direction = arrayOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)
  }
}

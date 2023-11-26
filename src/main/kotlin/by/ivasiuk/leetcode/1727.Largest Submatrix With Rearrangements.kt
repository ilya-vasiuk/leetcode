package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">
 *   Largest Submatrix With Rearrangements</a>
 */
class LargestSubmatrixWithRearrangements {
  fun largestSubmatrix(matrix: Array<IntArray>): Int {
    for (i in 1 until matrix.size) {
      for (j in matrix[0].indices) {
        if (matrix[i][j] == 1) {
          matrix[i][j] += matrix[i - 1][j]
        }
      }
    }

    var max = 0
    matrix.forEach { row ->
      row.sortedDescending().forEachIndexed { index, height ->
        max = maxOf(max, (index + 1) * height)
      }
    }

    return max
  }
}

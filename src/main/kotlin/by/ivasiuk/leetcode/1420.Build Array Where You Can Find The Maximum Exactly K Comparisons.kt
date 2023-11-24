package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/build-array-where-you-can-find-the-maximum-exactly-k-comparisons/">
 *   Build Array Where You Can Find The Maximum Exactly K Comparisons</a>
 */
class BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons {
  fun numOfArrays(n: Int, m: Int, k: Int): Int {
    if (m < k || n < k || k == 0) {
      return 0
    }

    val options = MutableList(n + 1) { MutableList(m + 1) { MutableList(k + 1) { 0 } } }
      .also { it[0][0][0] = 1 }

    for (size in 1..n) {
      for (maxElement in 1..m) {
        for (score in 1..k) {
          var currentScore = 0L
          currentScore += options[size - 1][maxElement][score].toLong() * maxElement

          for (prevMaxVal in 0 until maxElement) {
            currentScore += options[size - 1][prevMaxVal][score - 1]
          }

          options[size][maxElement][score] = (currentScore % MODULO).toInt()
        }
      }
    }

    return (options[n].sumOf { it[k].toLong() } % MODULO).toInt()
  }

  companion object {
    private const val MODULO = 1_000_000_007L
  }
}

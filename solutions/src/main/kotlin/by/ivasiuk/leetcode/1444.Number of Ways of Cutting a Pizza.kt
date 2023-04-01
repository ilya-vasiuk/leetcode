package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">
 *   Number of Ways of Cutting a Pizza</a>
 */
class NumberOfWaysOfCuttingAPizza {
  fun ways(pizza: Array<String>, k: Int): Int {
    val m = pizza.size
    val n = pizza[0].length
    val cache = Array(m) { Array(n) { IntArray(k) { -1 } } }
    val prefixSum = Array(m + 1) { IntArray(n + 1) }.also {
      (1..m).forEach { i ->
        (1..n).forEach { j ->
          it[i][j] = it[i - 1][j] + it[i][j - 1] - it[i - 1][j - 1] + if (pizza[i - 1][j - 1] == 'A') 1 else 0
        }
      }
    }

    fun cut(i: Int, j: Int, cuts: Int): Int =
      when {
        prefixSum[m][n] - prefixSum[i][n] - prefixSum[m][j] + prefixSum[i][j] == 0 -> 0
        cuts == 0 -> 1
        cache[i][j][cuts - 1] != -1 -> cache[i][j][cuts - 1]
        else -> {
          var result = 0

          for (row in i + 1 until m) {
            if (prefixSum[row][n] - prefixSum[i][n] - prefixSum[row][j] + prefixSum[i][j] > 0) {
              result = (result + cut(row, j, cuts - 1)) % MODULO
            }
          }

          for (column in j + 1 until n) {
            if (prefixSum[m][column] - prefixSum[i][column] - prefixSum[m][j] + prefixSum[i][j] > 0) {
              result = (result + cut(i, column, cuts - 1)) % MODULO
            }
          }

          result.also { cache[i][j][cuts - 1] = it }
        }
      }


    return cut(0, 0, k - 1)
  }

  companion object {
    private const val MODULO = 1_000_000_007
  }
}

package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/k-inverse-pairs-array/">
 *   K Inverse Pairs Array</a>
 */
class KInversePairsArray {
  fun kInversePairs(n: Int, k: Int): Int {
    val dp = Array(n + 1) { IntArray(k + 1) { -1 } }

    fun countPair(n: Int, k: Int): Int =
      when {
        k == 0 || (n == 2 && k == 1) -> 1
        (n == 2 && k > 1) || (n <= 1 && k >= 1) -> 0
        dp[n][k] != -1 -> dp[n][k]
        else -> {
          var result = 0

          for (i in 1..minOf(k + 1, n)) {
            result = (result + countPair(n - 1, k - i + 1)) % MODULO
          }

          result.also {
            dp[n][k] = it
          }
        }
      }

    return countPair(n, k)
  }

  companion object {
    const val MODULO = 1_000_000_007
  }
}

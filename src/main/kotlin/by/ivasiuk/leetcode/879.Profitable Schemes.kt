package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/profitable-schemes/">Profitable Schemes</a>
 */
class ProfitableSchemes {
  fun profitableSchemes(n: Int, minProfit: Int, group: IntArray, profit: IntArray): Int {
    val schemes = Array(n + 1) { IntArray(minProfit + 1) }
      .also { it[0][0] = 1 }

    for (i in group.indices) {
      for (j in n - group[i] downTo 0) {
        for (k in minProfit downTo 0) {
          schemes[j + group[i]][minOf(k + profit[i], minProfit)] += schemes[j][k]
          schemes[j + group[i]][minOf(k + profit[i], minProfit)] %= MODULO
        }
      }
    }

    return schemes
      .map { it[minProfit] }
      .reduce { sum, scheme -> (sum + scheme) % MODULO }
  }

  companion object {
    const val MODULO = 1_000_000_007
  }
}

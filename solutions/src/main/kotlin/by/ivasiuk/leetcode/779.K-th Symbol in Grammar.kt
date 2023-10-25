package by.ivasiuk.leetcode

import kotlin.math.pow

/**
 * @see <a href="https://leetcode.com/problems/k-th-symbol-in-grammar/">K-th Symbol in Grammar</a>
 */
class KthSymbolInGrammar {
  fun kthGrammar(n: Int, k: Int): Int {
    if (n == 1 && k == 1) {
      return 0
    }

    val mid = 2.0.pow(n - 1).toInt() / 2

    return if (k <= mid) {
      kthGrammar(n - 1, k)
    } else {
      1 - kthGrammar(n - 1, k - mid)
    }
  }
}

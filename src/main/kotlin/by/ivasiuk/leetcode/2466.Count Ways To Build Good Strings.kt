package by.ivasiuk.leetcode


/**
 * @see <a href="https://leetcode.com/problems/count-ways-to-build-good-strings/">
 *   Count Ways To Build Good Strings</a>
 */
class CountWaysToBuildGoodStrings {
  fun countGoodStrings(low: Int, high: Int, zero: Int, one: Int): Int {
    val options = IntArray(high + 1).also { it[0] = 1 }

    for (i in minOf(zero, one)..high) {
      if (i >= zero) {
        options[i] = (options[i] + options[i - zero]) % MODULO
      }
      if (i >= one) {
        options[i] = (options[i] + options[i - one]) % MODULO
      }
    }

    return (low..high)
      .fold(0) { sum, i -> (sum + options[i]) % MODULO }
  }

  companion object {
    const val MODULO = 1_000_000_007
  }
}

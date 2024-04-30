package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/number-of-wonderful-substrings/">
 *   Number of Wonderful Substrings</a>
 */
class NumberOfWonderfulSubstrings {
  fun wonderfulSubstrings(word: String): Long {
    val dp = LongArray(1 shl 11)
    var result = 0L
    var bits = 0

    for (char in word) {
      bits = bits.xor(1.shl(char - 'a'))
      var current = dp[bits] + if (bits.countOneBits() <= 1) 1L else 0

      for (j in 0 until 10) {
        current += dp[bits xor (1 shl j)]
      }

      result += current
      dp[bits] += 1L
    }

    return result
  }
}

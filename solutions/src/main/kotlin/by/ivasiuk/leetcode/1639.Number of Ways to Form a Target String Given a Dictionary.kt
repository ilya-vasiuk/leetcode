package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/number-of-ways-to-form-a-target-string-given-a-dictionary/">
 *   Number of Ways to Form a Target String Given a Dictionary</a>
 */
class NumberOfWaysToFormATargetStringGivenADictionary {
  fun numWays(words: Array<String>, target: String): Int {
    val m = target.length
    val k = words[0].length
    val cnt = Array(26) { IntArray(k) }
    val modulo = 1_000_000_007L

    for (j in 0 until k) {
      for (word in words) {
        cnt[word[j] - 'a'][j]++
      }
    }

    val options = Array(m + 1) { LongArray(k + 1) }
      .also { it[0][0] = 1 }

    for (i in 0..m) {
      for (j in 0 until k) {
        if (i < m) {
          options[i + 1][j + 1] = (options[i + 1][j + 1] + cnt[target[i] - 'a'][j] * options[i][j]) % modulo
        }

        options[i][j + 1] = (options[i][j] + options[i][j + 1]) % modulo
      }
    }

    return options[m][k].toInt()
  }
}

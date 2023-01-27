package by.ivasiuk.leetcode


/**
 * @see <a href="https://leetcode.com/problems/concatenated-words/">
 *   Concatenated Words</a>
 */
class ConcatenatedWords {
  fun findAllConcatenatedWordsInADict(words: Array<String>): List<String> {
    val result = mutableListOf<String>()
    val preWords = mutableSetOf<String>()
    words.sortBy { it.length }

    words.sortedBy { it.length }.forEach { word ->
      if (check(word, preWords)) {
        result.add(word)
      }

      preWords.add(word)
    }

    return result
  }

  private fun check(word: String, dict: Set<String>): Boolean {
    if (dict.isEmpty()) {
      return false
    }

    val dp = BooleanArray(word.length + 1)
    dp[0] = true

    for (i in 1..word.length) {
      for (j in 0 until i) {
        if (dp[j] && dict.contains(word.substring(j, i))) {
          dp[i] = true
          break
        }
      }
    }

    return dp.last()
  }
}

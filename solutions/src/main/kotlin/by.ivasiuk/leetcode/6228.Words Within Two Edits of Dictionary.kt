package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/words-within-two-edits-of-dictionary/">
 *   Words Within Two Edits of Dictionary</a>
 */
class WordsWithinTwoEditsOfDictionary {
  fun twoEditWords(queries: Array<String>, dictionary: Array<String>): List<String> {
    val result = mutableListOf<String>()

    for (qWord in queries) {
      for (dWord in dictionary) {
        if (areWordsSimilar(qWord, dWord)) {
          result.add(qWord)
          break
        }
      }
    }

    return result
  }

  private fun areWordsSimilar(word1: String, word2: String): Boolean {
    var edits = 2
    for (i in word1.indices) {
      if (word1[i] - word2[i] != 0) edits--

      if (edits < 0) {
        return false
      }
    }

    return true
  }
}
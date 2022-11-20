package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/merge-strings-alternately/">
 *   Merge Strings Alternately</a>
 */
class MergeStringsAlternately {
  fun mergeAlternately(word1: String, word2: String): String {
    val minLength = minOf(word1.length, word2.length)
    val result = CharArray(minLength * 2)

    for (i in 0 until minLength) {
      result[i * 2] = word1[i]
      result[i * 2 + 1] = word2[i]
    }

    return result.joinToString("") +
        if (word1.length > word2.length) {
          word1.substring(word2.length until word1.length)
        } else {
          word2.substring(word1.length until word2.length)
        }
  }
}

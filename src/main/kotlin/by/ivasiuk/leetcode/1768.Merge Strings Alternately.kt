package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/merge-strings-alternately/">
 *   Merge Strings Alternately</a>
 */
class MergeStringsAlternately {
  fun mergeAlternately(word1: String, word2: String): String =
    buildString {
      for (i in 0 until maxOf(word1.length, word2.length)) {
        if (i < word1.length) {
          append(word1[i])
        }

        if (i < word2.length) {
          append(word2[i])
        }
      }
    }
}

package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/determine-if-two-strings-are-close/">
 *   Determine if Two Strings Are Close</a>
 */
class DetermineIfTwoStringsAreClose {
  fun closeStrings(word1: String, word2: String): Boolean {
    if (word1.length != word2.length) {
      return false
    }

    val letters1 = IntArray(26)
    val letters2 = IntArray(26)

    for (i in word1.indices) {
      letters1[word1[i] - 'a']++
      letters2[word2[i] - 'a']++
    }

    for (i in 0..25) {
      if (letters1[i] == 0 && letters2[i] != 0 || letters1[i] != 0 && letters2[i] == 0) {
        return false
      }
    }

    return letters1.sorted() == letters2.sorted()
  }
}

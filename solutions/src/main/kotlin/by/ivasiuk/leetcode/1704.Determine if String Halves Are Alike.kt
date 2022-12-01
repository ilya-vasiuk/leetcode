package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/determine-if-string-halves-are-alike/">
 *   Determine if String Halves Are Alike</a>
 */
class DetermineIfStringHalvesAreAlike {
  fun halvesAreAlike(s: String): Boolean {
    val middle = s.length / 2
    var diff = 0

    for (i in 0 until middle) {
      if (VOWELS.contains(s[i])) diff++
      if (VOWELS.contains(s[middle + i])) diff--
    }

    return diff == 0
  }

  companion object {
    val VOWELS = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
  }
}

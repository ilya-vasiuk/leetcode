package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">
 *   Minimum Number of Steps to Make Two Strings Anagram</a>
 */
class MinimumNumberOfStepsToMakeTwoStringsAnagram {
  fun minSteps(s: String, t: String): Int {
    val letters = IntArray(26)

    for (i in s.indices) {
      letters[s[i] - 'a']++
      letters[t[i] - 'a']--
    }

    return letters.filter { it > 0 }.sum()
  }
}

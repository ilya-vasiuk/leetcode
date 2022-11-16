package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/">
 *   Check if One String Swap Can Make Strings Equal</a>
 */
class CheckIfOneStringSwapCanMakeStringsEqual {
  fun areAlmostEqual(s1: String, s2: String): Boolean {
    var difference: Pair<Char, Char>? = null
    var swapped = false

    for (i in s1.indices) {
      if (s1[i] != s2[i]) {
        if (swapped) {
          return false
        } else if(difference != null) {
          if (difference.first == s2[i] && difference.second == s1[i]) {
            swapped = true
          } else {
            return false
          }
        } else {
          difference = Pair(s1[i], s2[i])
        }
      }
    }

    return difference == null || swapped
  }
}

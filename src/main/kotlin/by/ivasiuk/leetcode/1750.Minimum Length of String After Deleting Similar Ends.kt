package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/">
 *   Minimum Length of String After Deleting Similar Ends</a>
 */
class MinimumLengthOfStringAfterDeletingSimilarEnds {
  fun minimumLength(s: String): Int {
    var i = 0
    var j = s.lastIndex

    while (i != j && s[i] == s[j]) {
      val current = s[i]

      while (i <= j && s[i] == current) i++
      while (i <= j && s[j] == current) j--
    }

    return j - i + 1
  }
}

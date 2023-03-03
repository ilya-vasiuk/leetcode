package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/">
 *   Find the Index of the First Occurrence in a String</a>
 */
class FindTheIndexOfTheFirstOccurrenceInAString {
  fun strStr(haystack: String, needle: String): Int {
    for (i in 0..haystack.length - needle.length) {
      for (j in needle.indices) {
        if (needle[j] != haystack[i + j]) {
          break
        }

        if (j == needle.length - 1) {
          return i
        }
      }
    }

    return -1
  }
}

package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/">
 *   Find the Index of the First Occurrence in a String</a>
 */
class FindTheIndexOfTheFirstOccurrenceInAString {
  fun strStr(haystack: String, needle: String): Int {
    var j = 0
    var i = 0
    var start = -1

    while (i < haystack.length) {
      if (haystack[i] == needle[j]) {
        if (j == 0) {
          start = i
        }

        if (++j == needle.length) {
          return start
        }
      } else if (start != -1) {
        j = 0
        i = start
        start = -1
      }

      i++
    }

    return -1
  }
}

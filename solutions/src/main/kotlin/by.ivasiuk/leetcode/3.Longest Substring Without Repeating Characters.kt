package by.ivasiuk.leetcode

class LongestSubstringWithoutRepeatingCharacters {
  fun lengthOfLongestSubstring(s: String): Int {
    if (s.isEmpty()) {
      return 0
    }

    var maxLength = 1

    for (i in 0 until s.length - 1) {
      var current = "" + s[i]
      for (j in i + 1 until s.length) {
        current += if (current.indexOf(s[j]) == -1) {
          s[j]
        } else {
          break
        }
      }

      if (current.length > maxLength) {
        maxLength = current.length
      }
    }
    return maxLength
  }
}
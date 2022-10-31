package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/backspace-string-compare/">
 *   Backspace String Compare</a>
 */
class BackspaceStringCompare {
  fun backspaceCompare(s: String, t: String): Boolean {
    var i = s.length - 1
    var j = t.length - 1

    while (i >= 0 || j >= 0) {
      i = backspace(s, i)
      j = backspace(t, j)

      if ((i < 0 && j < 0) || i >= 0 && j >= 0 && s[i] == t[j]) {
        i--
        j--
      } else {
        return false
      }
    }

    return true
  }

  private fun backspace(s: String, ind: Int): Int {
    var i = ind
    var skip = 0

    while (i >= 0 && s[i] == '#') {
      while (i >= 0 && s[i] == '#') {
        skip++
        i--
      }
      while (skip > 0 && i >= 0) {
        if (s[i] == '#') break
        skip--
        i--
      }
    }

    return i
  }
}
package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/assign-cookies/">Assign Cookies</a>
 */
class AssignCookies {
  fun findContentChildren(g: IntArray, s: IntArray): Int {
    g.sort()
    s.sort()

    var si = s.lastIndex
    var gi = g.lastIndex

    if (si >= 0) {
      while (gi >= 0 && g[gi] > s[si]) {
        gi--
      }
    }

    while (gi >= 0 && si >= 0) {
      if (g[gi] <= s[si]) {
        si--
      }

      gi--
    }

    return s.size - si - 1
  }
}

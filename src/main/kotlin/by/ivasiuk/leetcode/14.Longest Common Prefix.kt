package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/longest-common-prefix/">
 *   Longest Common Prefix</a>
 */
class LongestCommonPrefix {
  fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.size == 1) {
      return strs[0]
    }
    val shortest = strs.minBy { it.length }
    val length = shortest.length

    var i = 0
    while (i < length) {
      if (strs.any { it[i] != shortest[i]}) {
        break
      }
      i++
    }

    return shortest.substring(0, i)
  }
}
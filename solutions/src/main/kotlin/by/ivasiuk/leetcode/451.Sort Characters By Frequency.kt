package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/sort-characters-by-frequency/">
 *   Sort Characters By Frequency</a>
 */
class SortCharactersByFrequency {
  fun frequencySort(s: String): String {
    val result = StringBuilder()

    s.groupingBy { it }.eachCount()
      .entries.sortedByDescending { it.value }
      .forEach { (c, n) -> for (i in 1..n) result.append(c) }

    return result.toString()
  }
}

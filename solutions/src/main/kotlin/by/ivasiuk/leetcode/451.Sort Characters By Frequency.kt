package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/sort-characters-by-frequency/">
 *   Sort Characters By Frequency</a>
 */
class SortCharactersByFrequency {
  fun frequencySort(s: String): String =
    s.groupingBy { it }.eachCount()
      .entries.sortedByDescending { it.value }
      .joinToString("") { (c, n) -> c.toString().repeat(n) }
}

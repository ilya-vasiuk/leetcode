package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/unique-number-of-occurrences/">
 *   Unique Number of Occurrences</a>
 */
class UniqueNumberOfOccurrences {
  fun uniqueOccurrences(arr: IntArray): Boolean =
    arr.asList()
      .groupingBy { it }
      .eachCount()
      .values
      .groupBy { it }
      .none { it.value.size > 1}
}

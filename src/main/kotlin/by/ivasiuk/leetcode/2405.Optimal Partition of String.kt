package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/optimal-partition-of-string/">
 *   Optimal Partition of String</a>
 */
class OptimalPartitionOfString {
  fun partitionString(s: String): Int {
    val letters = BooleanArray(26)
    var substrings = 1

    for (c in s) {
      if (letters[c - 'a']) {
        letters.indices.forEach { letters[it] = false }
        substrings++
      }

      letters[c - 'a'] = true
    }

    return substrings
  }
}

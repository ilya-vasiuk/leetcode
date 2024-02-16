package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/">
 *   Least Number of Unique Integers after K Removals</a>
 */
class LeastNumberOfUniqueIntegersAfterKRemovals {
  fun findLeastNumOfUniqueInts(arr: IntArray, k: Int): Int {
    val frequency = arr.toList().groupingBy { it }.eachCount().toList().sortedBy { it.second }
    var carry = k

    frequency.forEachIndexed { i, (_, freq) ->
      if (freq <= carry) {
        carry -= freq
      } else {
        return frequency.size - i
      }
    }

    return 0
  }
}

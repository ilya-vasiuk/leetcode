package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/">
 *   Minimum Number of Operations to Make Array Empty</a>
 */
class MinimumNumberOfOperationsToMakeArrayEmpty {
  fun minOperations(nums: IntArray): Int {
    val freq = nums.toList().groupingBy { it }.eachCount()
    var result = 0

    freq.forEach { (_, occurrence) ->
      if (occurrence == 1) {
        return -1
      }

      result += occurrence / 3 + if (occurrence % 3 == 0) 0 else 1
    }

    return result
  }
}

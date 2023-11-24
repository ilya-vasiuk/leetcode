package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/number-of-good-pairs/">
 *   Number of Good Pairs</a>
 */
class NumberOfGoodPairs {
  fun numIdenticalPairs(nums: IntArray): Int =
    with(mutableMapOf<Int, Int>()) {
      var result = 0

      nums.forEach { n ->
        getOrDefault(n, 0).also {
          set(n, it + 1)
          result += it
        }
      }

      return result
    }
}

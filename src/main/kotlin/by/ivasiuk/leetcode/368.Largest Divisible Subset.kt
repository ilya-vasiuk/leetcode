package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/largest-divisible-subset/">
 *   Largest Divisible Subset</a>
 */
class LargestDivisibleSubset {
  fun largestDivisibleSubset(nums: IntArray): List<Int> {
    val dp = mutableMapOf<Int, List<Int>>()
    nums.sort()

    fun check(i: Int): List<Int> = dp.getOrPut(i) {
      val x = if (i == 0) 1 else nums[i - 1]
      var max = listOf<Int>()

      for (j in i until nums.size) {
        if (nums[j] % x == 0) {
          val next = listOf(nums[j]) + check(j + 1)

          if (next.size > max.size) {
            max = next
          }
        }
      }

      max
    }

    return check(0)
  }
}

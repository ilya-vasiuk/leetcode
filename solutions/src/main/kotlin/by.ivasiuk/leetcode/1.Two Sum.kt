package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
class TwoSum {
  fun twoSum(nums: IntArray, target: Int): IntArray {
    for (i in 0 until nums.size - 1) {
      for (j in i + 1 until nums.size) {
        if (nums[i] + nums[j] == target) {
          return intArrayOf(i, j)
        }
      }
    }

    return IntArray(2)
  }
}

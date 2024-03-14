package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/binary-subarrays-with-sum/">
 *   Binary Subarrays With Sum</a>
 */
class BinarySubarraysWithSum {
  fun numSubarraysWithSum(nums: IntArray, goal: Int): Int {
    var goal = goal
    var i = 0
    var count = 0
    var res = 0

    for (j in nums.indices) {
      if (nums[j] == 1) {
        goal--
        count = 0
      }

      while (goal == 0 && i <= j) {
        goal += nums[i++]
        count++

        if (i > j - goal + 1) {
          break
        }
      }

      while (goal < 0) {
        goal += nums[i++]
      }

      res += count
    }

    return res
  }
}

package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/move-zeroes/">Move Zeroes</a>
 */
class MoveZeroes {
  fun moveZeroes(nums: IntArray) {
    var j = 0

    for (i in nums.indices) {
      if (nums[i] != 0) {
        if (nums[j] == 0) {
          val tmp = nums[i]
          nums[i] = nums[j]
          nums[j] = tmp
        }

        j++
      }
    }
  }
}

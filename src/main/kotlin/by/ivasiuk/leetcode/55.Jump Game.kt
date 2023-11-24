package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/jump-game/">
 *   Jump Game</a>
 */
class JumpGame {
  fun canJump(nums: IntArray): Boolean {
    if (nums.size == 1) {
      return true
    }

    val accessible = BooleanArray(nums.size)
    accessible[0] = true

    for (i in 0 until nums.size - 1) {
      if (accessible[i]) {
        if (i + nums[i] >= nums.size) {
          return true
        }

        var curr = i
        while (curr < nums.size && nums[curr] != 0) {
          if (curr + nums[curr] >= nums.size - 1) {
            return true
          }

          for (j in curr until curr + nums[curr]) {
            accessible[j] = true
          }

          val tmp = nums[curr]
          nums[curr] = 0
          curr += tmp
        }
      }
    }

    return false
  }
}
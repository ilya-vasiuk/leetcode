package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/jump-game-ii/">
 *   Jump Game II</a>
 */
class JumpGame2 {
  fun jump(nums: IntArray): Int {
    var jumps = 0
    var max = 0
    var currMax = 0

    for (i in 0 until nums.size - 1) {
      currMax = maxOf(currMax, i + nums[i])

      if (i == max) {
        jumps++
        max = currMax

        if (max >= nums.size - 1) {
          break
        }
      }
    }

    return jumps
  }
}
package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/check-if-there-is-a-valid-partition-for-the-array/">
 *   Check if There is a Valid Partition For The Array</a>
 */
class CheckIfThereIsAValidPartitionForTheArray {
  fun validPartition(nums: IntArray): Boolean {
    val stack = LinkedList<Int>().apply { push(nums.lastIndex) }

    while (stack.isNotEmpty()) {
      val i = stack.pop()

      if (i == -1) {
        return true
      }

      if (i >= 1 && nums[i] == nums[i - 1]) {
        stack.push(i - 2)
      }

      if (i >= 2) {
        if (nums[i] == nums[i - 1] && nums[i] == nums[i - 2]) {
          stack.push(i - 3)
        }

        if (nums[i] == nums[i - 1] + 1 && nums[i] == nums[i - 2] + 2) {
          stack.push(i - 3)
        }
      }
    }

    return false
  }
}

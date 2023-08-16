package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/sliding-window-maximum/">
 *   Sliding Window Maximum</a>
 */
class SlidingWindowMaximum {
  fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
    val queue = LinkedList<Int>()
    val result = IntArray(nums.size - k + 1)

    for (i in nums.indices) {
      while (queue.isNotEmpty() && queue.last < nums[i]) {
        queue.removeLast()
      }

      queue.add(nums[i])

      if (i >= k - 1) {
        result[i - k + 1] = queue.first

        if (nums[i - k + 1] == queue.first) {
          queue.removeFirst()
        }
      }
    }

    return result
  }
}

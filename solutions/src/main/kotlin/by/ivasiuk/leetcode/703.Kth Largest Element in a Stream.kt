package by.ivasiuk.leetcode

import java.util.PriorityQueue

/**
 * @see <a href="https://leetcode.com/problems/kth-largest-element-in-a-stream/">
 *   Kth Largest Element in a Stream</a>
 */
class KthLargest(k: Int, nums: IntArray) {
  private val k = k
  private val queue = PriorityQueue<Int>(compareBy { it })
    .apply { nums.forEach { put(it) } }

  fun add(`val`: Int): Int =
    with(queue) {
      put(`val`)

      peek()
    }

  private fun PriorityQueue<Int>.put(num: Int) {
    if (size < k || peek() < num) {
      offer(num)
      if (size > k) poll()
    }
  }
}

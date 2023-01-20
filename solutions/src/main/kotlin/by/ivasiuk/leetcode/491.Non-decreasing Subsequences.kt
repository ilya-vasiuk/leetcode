package by.ivasiuk.leetcode

import java.util.*


/**
 * @see <a href="https://leetcode.com/problems/non-decreasing-subsequences/">
 *   Non-decreasing Subsequences</a>
 */
class NonDecreasingSubsequences {
  fun findSubsequences(nums: IntArray): List<List<Int>> {
    val res = mutableListOf<List<Int>>()

    check(LinkedList<Int>(), 0, nums, res)

    return res
  }

  private fun check(list: LinkedList<Int>, current: Int, nums: IntArray, res: MutableList<List<Int>>) {
    if (list.size > 1) {
      res.add(LinkedList(list))
    }

    val used = mutableSetOf<Int>()
    for (i in current until nums.size) {
      if (!used.contains(nums[i])) {
        if (list.size == 0 || nums[i] >= list.peekLast()) {
          used.add(nums[i])
          list.offer(nums[i])
          check(list, i + 1, nums, res)
          list.pollLast()
        }
      }
    }
  }
}

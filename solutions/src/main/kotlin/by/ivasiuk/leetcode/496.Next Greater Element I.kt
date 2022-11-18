package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/next-greater-element-i/">
 *   Next Greater Element I</a>
 */
class NextGreaterElement1 {
  fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
    val memo = mutableMapOf<Int, Int>()
    val stack = Stack<Int>()

    for (num in nums2) {
      while(stack.isNotEmpty() && stack.peek() < num) {
        memo[stack.pop()] = num
      }

      stack.push(num)
    }

    return nums1.map { memo.getOrDefault(it, -1) }.toIntArray()
  }
}

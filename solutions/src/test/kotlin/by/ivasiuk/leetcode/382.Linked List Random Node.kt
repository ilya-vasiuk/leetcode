package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertContains

class LinkedListRandomNodeTest {
  @Test
  fun example1() {
    val nums = intArrayOf(1, 2, 3)

    val solution = LinkedListRandomNode(
      head = ListNode.fromList(*nums)
    )

    assertContains(nums, solution.getRandom())
    assertContains(nums, solution.getRandom())
    assertContains(nums, solution.getRandom())
    assertContains(nums, solution.getRandom())
    assertContains(nums, solution.getRandom())
  }
}

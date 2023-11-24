package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertContentEquals

class PartitionListTest {
  private val solution = PartitionList()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(1, 2, 2, 4, 3, 5),
      actual = solution.partition(
        head = ListNode.fromList(1, 4, 3, 2, 5, 2),
        x = 3,
      )?.toList()
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(1, 2),
      actual = solution.partition(
        head = ListNode.fromList(2, 1),
        x = 2,
      )?.toList()
    )
  }
}

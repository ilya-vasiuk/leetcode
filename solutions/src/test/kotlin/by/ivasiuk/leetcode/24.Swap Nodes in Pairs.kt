package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertNull

class SwapNodesInPairsTest {
  private val solution = SwapNodesInPairs()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(2, 1, 4, 3),
      actual = solution.swapPairs(
        head = ListNode.fromList(
          nums = intArrayOf(1, 2, 3, 4)
        )
      )?.toList()
    )
  }

  @Test
  fun example2() {
    assertNull(
      solution.swapPairs(
        head = null
      )?.toList()
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = listOf(1),
      actual = solution.swapPairs(
        head = ListNode.fromList(
          nums = intArrayOf(1)
        )
      )?.toList()
    )
  }
}

package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertNull

class MergeKSortedListsTest {
  private val solution = MergeKSortedLists()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(1,1,2,3,4,4,5,6),
      actual = solution.mergeKLists(
        lists = arrayOf(
          ListNode.fromList(1, 4, 5),
          ListNode.fromList(1, 3, 4),
          ListNode.fromList(2, 6)
        )
      )?.toList()
    )
  }

  @Test
  fun example2() {
    assertNull(solution.mergeKLists(arrayOf()))
  }

  @Test
  fun example3() {
    assertNull(solution.mergeKLists(arrayOf(null)))
  }
}

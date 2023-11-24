package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import by.ivasiuk.leetcode.common.assertInnerCollectionsContentEquals
import kotlin.test.Test

class SplitLinkedListInPartsTest {
  private val solution = SplitLinkedListInParts()

  @Test
  fun example1() {
    assertInnerCollectionsContentEquals(
      expected = listOf(
        listOf(1),
        listOf(2),
        listOf(3),
        emptyList(),
        emptyList(),
      ),
      actual = solution.splitListToParts(
        head = ListNode(1).apply {
          next = ListNode(2).apply {
            next = ListNode(3)
          }
        },
        k = 5
      ).map { it?.toList() ?: emptyList() }.toList()
    )
  }

  @Test
  fun example2() {
    assertInnerCollectionsContentEquals(
      expected = listOf(
        listOf(1, 2, 3, 4),
        listOf(5, 6, 7),
        listOf(8, 9, 10),
      ),
      actual = solution.splitListToParts(
        head = ListNode(1).apply {
          next = ListNode(2).apply {
            next = ListNode(3).apply {
              next = ListNode(4).apply {
                next = ListNode(5).apply {
                  next = ListNode(6).apply {
                    next = ListNode(7).apply {
                      next = ListNode(8).apply {
                        next = ListNode(9).apply {
                          next = ListNode(10)
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        },
        k = 3
      ).map { it?.toList() ?: emptyList() }.toList()
    )
  }
}

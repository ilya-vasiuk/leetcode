package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.ListNode
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class LinkedListCycleTest {
  private val solution = LinkedListCycle()

  @Test
  fun example1() {
    val cycleNode = ListNode(2)
    val head = ListNode(3).also {
      it.next = cycleNode.also {
        it.next = ListNode(0).also {
          it.next = ListNode(-4).also {
            it.next = cycleNode
          }
        }
      }
    }

    assertTrue {
      solution.hasCycle(head)
    }
  }

  @Test
  fun example2() {
    val cycleNode = ListNode(1)
    val head = cycleNode.also {
      it.next = ListNode(2).also {
        it.next = cycleNode
      }
    }

    assertTrue {
      solution.hasCycle(head)
    }
  }

  @Test
  fun oneElement() {
    val head = ListNode(1)

    assertFalse {
      solution.hasCycle(head)
    }
  }
}
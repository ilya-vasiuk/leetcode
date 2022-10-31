package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertNull
import by.ivasiuk.leetcode.PopulatingNextRightPointersInEachNode2.Node
import kotlin.test.assertEquals

class PopulatingNextRightPointersInEachNode2Test {
  private val solution = PopulatingNextRightPointersInEachNode2()

  @Test
  fun example1() {
    val root = solution.connect(
      root = Node(1).also {
        it.left = Node(2).also {
          it.left = Node(4)
          it.right = Node(5)
        }
        it.right = Node(3).also {
          it.right = Node(7)
        }
      }
    )

    assertNull(root!!.next)
    assertNull(root.right!!.next)
    assertNull(root.right!!.right!!.next)
    assertEquals(root.left!!.next, root.right)
    assertEquals(root.left!!.left!!.next, root.left!!.right)
    assertEquals(root.left!!.right!!.next, root.right!!.right)
  }

  @Test
  fun example2() {
    assertNull(solution.connect(null))
  }
}

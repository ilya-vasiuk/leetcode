package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.Node
import kotlin.test.*

class CloneGraphText {
  private val solution = CloneGraph()

  @Test
  fun example1() {
    val node1 = Node(1)
    val node2 = Node(2)
    val node3 = Node(3)
    val node4 = Node(4)

    node1.neighbors.add(node2)
    node1.neighbors.add(node4)
    node2.neighbors.add(node1)
    node2.neighbors.add(node3)
    node3.neighbors.add(node2)
    node3.neighbors.add(node4)
    node4.neighbors.add(node1)
    node4.neighbors.add(node3)

    val copy = solution.cloneGraph(node1)
    assertEquals(1, copy!!.`val`)
    assertContentEquals(listOf(2, 4), copy.neighbors.map { it!!.`val` })
  }

  fun example2() {
    val copy = solution.cloneGraph(Node(1))!!
    assertEquals(1, copy.`val`)
    assertTrue { copy.neighbors.isEmpty() }
  }

  fun example3() {
    assertNull(solution.cloneGraph(null))
  }
}

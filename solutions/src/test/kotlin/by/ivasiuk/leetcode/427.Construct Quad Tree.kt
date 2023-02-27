package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ConstructQuadTreeTest {
  private val solution = ConstructQuadTree()

  @Test
  fun example1() {
    val root = solution.construct(
      grid = arrayOf(
        intArrayOf(0, 1),
        intArrayOf(1, 0),
      ),
    )

    assertNode(node = root, isLeaf = false, value = true)
    assertNode(node = root.topLeft!!, isLeaf = true, value = false)
    assertNode(node = root.topRight!!, isLeaf = true, value = true)
    assertNode(node = root.bottomLeft!!, isLeaf = true, value = true)
    assertNode(node = root.bottomRight!!, isLeaf = true, value = false)
  }

  @Test
  fun example2() {
    val root = solution.construct(
      grid = arrayOf(
        intArrayOf(1,1,1,1,0,0,0,0),
        intArrayOf(1,1,1,1,0,0,0,0),
        intArrayOf(1,1,1,1,1,1,1,1),
        intArrayOf(1,1,1,1,1,1,1,1),
        intArrayOf(1,1,1,1,0,0,0,0),
        intArrayOf(1,1,1,1,0,0,0,0),
        intArrayOf(1,1,1,1,0,0,0,0),
        intArrayOf(1,1,1,1,0,0,0,0),
      ),
    )

    assertNode(node = root, isLeaf = false, value = true)

    assertNode(node = root.topLeft!!, isLeaf = true, value = true)
    assertNode(node = root.topRight!!, isLeaf = false, value = true)
    assertNode(node = root.bottomLeft!!, isLeaf = true, value = true)
    assertNode(node = root.bottomRight!!, isLeaf = true, value = false)

    assertNode(node = root.topRight!!.topLeft!!, isLeaf = true, value = false)
    assertNode(node = root.topRight!!.topRight!!, isLeaf = true, value = false)
    assertNode(node = root.topRight!!.bottomLeft!!, isLeaf = true, value = true)
    assertNode(node = root.topRight!!.bottomRight!!, isLeaf = true, value = true)
  }

  private fun assertNode(node: ConstructQuadTree.Node, isLeaf: Boolean, value: Boolean) {
    assertEquals(isLeaf, node.isLeaf)
    assertEquals(value, node.`val`)
  }
}

package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
class ConstructQuadTree {
  fun construct(grid: Array<IntArray>, x: Int = 0, y: Int = 0, n: Int = grid.size): Node {
    if (n == 1) {
      return Node(grid[x][y] == 1, true)
    }

    val mid = n / 2
    val topLeft = construct(grid, x, y, mid)
    val topRight =  construct(grid, x, y + mid, mid)
    val bottomLeft = construct(grid, x + mid, y, mid)
    val bottomRight = construct(grid, x + mid, y + mid, mid)

    return if (topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf &&
      topLeft.`val` == topRight.`val` && topRight.`val` == bottomLeft.`val` && bottomLeft.`val` == bottomRight.`val`) {
      topLeft
    } else {
      Node(`val` = true, isLeaf = false).also {
        it.topRight = topRight
        it.topLeft = topLeft
        it.bottomLeft = bottomLeft
        it.bottomRight = bottomRight
      }
    }
  }


  /**
   * Definition for a QuadTree node.
   */
  class Node(var `val`: Boolean, var isLeaf: Boolean) {
    var topLeft: Node? = null
    var topRight: Node? = null
    var bottomLeft: Node? = null
    var bottomRight: Node? = null
  }
}

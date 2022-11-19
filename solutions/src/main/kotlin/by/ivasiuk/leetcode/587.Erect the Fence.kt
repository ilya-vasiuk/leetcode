package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/erect-the-fence/">Erect the Fence</a>
 */
class ErectTheFence {
  fun outerTrees(trees: Array<IntArray>): Array<IntArray> {
    if (trees.size <= 3) {
      return trees
    }

    val bottomLeft = trees.minBy { it[1] }
    trees.sortWith { p, q ->
      val diff = orientation(bottomLeft, p!!, q!!) - orientation(bottomLeft, q, p)
      when {
        diff > 0 -> 1
        diff < 0 -> -1
        else -> distance(bottomLeft, p) - distance(bottomLeft, q)
      }
    }

    var i = trees.size - 1
    while (i >= 0 && orientation(bottomLeft, trees[trees.size - 1], trees[i]) == 0) i--

    var l = i + 1
    var h = trees.size - 1
    while (l < h) {
      val temp: IntArray = trees[l]
      trees[l] = trees[h]
      trees[h] = temp

      l++
      h--
    }

    val stack = Stack<IntArray>()
    stack.push(trees[0])
    stack.push(trees[1])

    for (j in 2 until trees.size) {
      var top = stack.pop()
      while (orientation(stack.peek(), top!!, trees[j]) > 0) top = stack.pop()
      stack.push(top)
      stack.push(trees[j])
    }

    return stack.toTypedArray()
  }

  private fun orientation(p: IntArray, q: IntArray, r: IntArray): Int {
    return (q[1] - p[1]) * (r[0] - q[0]) - (q[0] - p[0]) * (r[1] - q[1])
  }

  private fun distance(p: IntArray, q: IntArray): Int {
    return (p[0] - q[0]) * (p[0] - q[0]) + (p[1] - q[1]) * (p[1] - q[1])
  }
}

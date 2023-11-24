package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/validate-binary-tree-nodes/">
 *   Validate Binary Tree Nodes</a>
 */
class ValidateBinaryTreeNodes {
  fun validateBinaryTreeNodes(n: Int, leftChild: IntArray, rightChild: IntArray): Boolean {
    val parents = IntArray(n)
    for (i in 0 until n) {
      if (leftChild[i] != -1) {
        parents[leftChild[i]]++
      }

      if (rightChild[i] != -1) {
        parents[rightChild[i]]++
      }
    }

    var roots = 0
    var rootNode = -1

    for (i in 0 until n) {
      if (parents[i] == 0) {
        roots++
        rootNode = i
      }

      if (parents[i] > 1) {
        return false
      }
    }

    if (roots != 1) {
      return false
    }

    fun traverse(node: Int): Int {
      return (if (leftChild[node] != -1) traverse(leftChild[node]) + 1 else 0) +
          (if (rightChild[node] != -1) traverse(rightChild[node]) + 1 else 0)
    }

    return traverse(rootNode) == n - 1
  }
}

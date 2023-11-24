package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/n-ary-tree-preorder-traversal/">
 *   N-ary Tree Preorder Traversal</a>
 */
class NaryTreePreorderTraversal {
  fun preorder(root: Node?): List<Int> {
    val result = mutableListOf<Int>()

    visit(root, result)

    return result
  }

  private fun visit(node: Node?, result: MutableList<Int>) {
    node?.let {
      result.add(it.`val`)

      it.children.forEach {child ->
        visit(child, result)
      }
    }
  }

  class Node(var `val`: Int) {
    var children: List<Node?> = listOf()
  }
}
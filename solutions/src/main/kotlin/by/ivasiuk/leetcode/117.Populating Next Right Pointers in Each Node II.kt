package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">
 *   Longest Substring Without Repeating Characters</a>
 */
class PopulatingNextRightPointersInEachNode2 {
  fun connect(root: Node?): Node? =
    root?.let {
      root.left?.let {
        if (root.right != null) {
          it.next = root.right
        } else {
          it.next = findNext(root)
        }
      }
      root.right?.let {
        it.next = findNext(root)
      }

      connect(root.right)
      connect(root.left)

      root
    }

  private fun findNext(root: Node): Node? {
    var current: Node? = root

    while (current!!.next != null) {
      current = current.next

      if (current?.left != null) {
        return current.left
      }

      if (current?.right != null) {
        return current.right
      }
    }

    return null
  }

  class Node(var `val`: Int) {
    var left: Node? = null
    var right: Node? = null
    var next: Node? = null
  }
}
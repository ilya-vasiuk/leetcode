package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/copy-list-with-random-pointer/">
 *   Copy List with Random Pointer</a>
 */
class CopyListWithRandomPointer {
  fun copyRandomList(node: Node?): Node? {
    val copyRoot = Node(0)
    var copy: Node? = copyRoot
    var cursor = node

    val linksToCopy = HashMap<Node, Node>()
    val linksToFurtherRandom = HashMap<Node, MutableList<Node>>()

    while (cursor != null) {
      copy!!.next = Node(cursor.`val`)
      copy = copy.next

      linksToCopy[cursor] = copy!!
      copy.random = linksToCopy[cursor.random]

      if (copy.random == null) {
        cursor.random?.let {
          linksToFurtherRandom.computeIfAbsent(it) { ArrayList() }.add(copy)
        }
      }

      linksToFurtherRandom[cursor]?.forEach { it.random = copy }

      cursor = cursor.next
    }

    return copyRoot.next
  }

  class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null
  }
}

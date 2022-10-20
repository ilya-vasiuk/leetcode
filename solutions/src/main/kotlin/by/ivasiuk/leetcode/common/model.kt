package by.ivasiuk.leetcode.common

class ListNode(var `val`: Int) {
  var next: ListNode? = null

  fun toList(): List<Int> {
    val list = mutableListOf<Int>()
    var current: ListNode? = this

    while (current != null) {
      list.add(current.`val`)
      current = current.next
    }

    return list
  }
}

class TreeNode(var `val`: Int) {
  var left: TreeNode? = null
  var right: TreeNode? = null
}
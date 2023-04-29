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

  companion object {
    fun fromList(vararg nums: Int): ListNode? {
      if (nums.isEmpty()) {
        return null
      }

      val head = ListNode(nums[0])
      var current = head

      for (i in 1 until nums.size) {
        current.next = ListNode(nums[i])
        current = current.next!!
      }

      return head
    }
  }
}

class TreeNode(var `val`: Int) {
  var left: TreeNode? = null
  var right: TreeNode? = null
}

class Node(var `val`: Int) {
  var neighbors = ArrayList<Node?>()
}

class UnionFind(size: Int) {
  private val parent = IntArray(size) { it }
  private val rank = IntArray(size)

  fun find(x: Int): Int {
    if (parent[x] != x) {
      parent[x] = find(parent[x])
    }

    return parent[x]
  }

  fun unionSet(x: Int, y: Int) {
    val xSet = find(x)
    val ySet = find(y)

    when {
      xSet == ySet -> return
      rank[xSet] < rank[ySet] -> parent[xSet] = ySet
      rank[xSet] > rank[ySet] -> parent[ySet] = xSet
      else -> parent[ySet] = xSet.also { rank[it]++ }
    }
  }
}
package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/diagonal-traverse-ii/">
 *   Diagonal Traverse II</a>
 */
class DiagonalTraverse2 {
  fun findDiagonalOrder(nums: List<List<Int>>): IntArray {
    val map = LinkedHashMap<Int, ArrayList<Int>>()
    val result = ArrayList<Int>()

    for (i in nums.indices) {
      for (j in nums[i].indices) {
        map.getOrPut(i + j) { ArrayList() }.add(nums[i][j])
      }
    }

    for (m in map.values) {
      result.addAll(m.reversed())
    }

    return result.toIntArray()
  }
}

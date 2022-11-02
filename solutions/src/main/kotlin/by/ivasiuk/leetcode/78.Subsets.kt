package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/subsets/">
 *   Subsets</a>
 */
class Subsets {
  fun subsets(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>(emptyList())

    for (i in nums.indices) {
      val current = mutableListOf(listOf(nums[i]))

      for (j in i + 1 until nums.size) {
        val current2 = mutableListOf<List<Int>>()

        for(cur in current) {
          current2.add(cur + nums[j])
        }

        current.addAll(current2)
      }

      result.addAll(current)
    }

    return result
  }
}
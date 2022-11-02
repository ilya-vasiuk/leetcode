package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/subsets-ii/">
 *   Subsets II</a>
 */
class Subsets2 {
  fun subsetsWithDup(nums: IntArray): List<List<Int>> {
    val result = mutableSetOf<List<Int>>(emptyList())
    val sortedNums = nums.sorted()

    for (i in sortedNums.indices) {
      val current = mutableSetOf(listOf(sortedNums[i]))

      for (j in i + 1 until sortedNums.size) {
        val current2 = mutableSetOf<List<Int>>()

        for(cur in current) {
          current2.add(cur + sortedNums[j])
        }

        current.addAll(current2)
      }

      result.addAll(current)
    }

    return result.toList()
  }
}
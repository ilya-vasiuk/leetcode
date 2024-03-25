package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-all-duplicates-in-an-array/">
 *   Find All Duplicates in an Array</a>
 */
class FindAllDuplicatesInAnArray {
  fun findDuplicates(nums: IntArray): List<Int> {
    val seen = mutableSetOf<Int>()
    return mutableListOf<Int>().apply {
      for (num in nums) {
        if (!seen.add(num)) {
          add(num)
        }
      }
    }
  }
}

package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/majority-element-ii/">
 *   Majority Element II</a>
 */
class MajorityElement2 {
  fun majorityElement(nums: IntArray): List<Int> {
    val map = mutableMapOf<Int, Int>()
    val limit = nums.size / 3
    val result = mutableListOf<Int>()

    for (num in nums) {
      val count = map.getOrDefault(num, 0) + 1
      map[num] = count

      if (count == limit + 1) {
        result.add(num)
      }
    }

    return result
  }
}

package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/majority-element/">Majority Element</a>
 */
class MajorityElement {
  fun majorityElement(nums: IntArray): Int {
    var count = 0
    var candidate = 0

    nums.forEach { num ->
      if (count == 0) {
        candidate = num
      }

      count += if (num == candidate) 1 else -1
    }

    return candidate
  }
}

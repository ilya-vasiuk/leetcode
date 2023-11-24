package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/contains-duplicate/">
 *   Contains Duplicate</a>
 */
class ContainsDuplicate2 {
  fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    for (i in 0 until nums.size - 1) {
      var j = i + 1
      while (j < i + k + 1 && j < nums.size) {
        if (nums[i] == nums[j++]) {
          return true
        }
      }
    }

    return false
  }
}
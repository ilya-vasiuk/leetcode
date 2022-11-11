package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">
 *   Remove Duplicates from Sorted Array</a>
 */
class RemoveDuplicatesFromSortedArray {
  fun removeDuplicates(nums: IntArray): Int {
    var i = 0
    var j = 1

    while (i <nums.size && j < nums.size) {
      while (j < nums.size) {
        if (nums[i] != nums[j]) {
          nums[i + 1] = nums[j]
          i++
          break
        }
        j++
      }
    }

    return i + 1
  }
}

package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-peak-element/">
 *   Find Peak Element</a>
 */
class FindPeakElement {
  fun findPeakElement(nums: IntArray): Int =
    findPeakElement(nums, 0, nums.size - 1)

  private fun findPeakElement(nums: IntArray, left: Int, right: Int): Int =
    if (left > right) {
      -1
    } else {
      val middle = (left + right) / 2

      if ((middle == 0 || nums[middle - 1] < nums[middle]) &&
        (middle == nums.size - 1 || nums[middle + 1] < nums[middle])
      ) {
        middle
      } else {
        if (middle != nums.size - 1 && nums[middle] < nums[middle + 1]) {
          findPeakElement(nums, middle + 1, right)
        } else if (middle != 0 && nums[middle] < nums[middle - 1]) {
          findPeakElement(nums, left, middle - 1)
        } else {
          -1
        }
      }
    }
}
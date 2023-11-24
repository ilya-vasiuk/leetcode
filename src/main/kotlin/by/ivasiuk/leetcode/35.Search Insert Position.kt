package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/search-insert-position/">
 *   Search Insert Position</a>
 */
class SearchInsertPosition {
  fun searchInsert(nums: IntArray, target: Int): Int {
    var begin = 0
    var end = nums.size - 1

    while (begin <= end) {
      val mid = (begin + end) / 2

      if (nums[mid] == target) {
        return mid
      } else if (nums[mid] > target) {
        end = mid - 1
      } else {
        begin = mid + 1
      }
    }

    return begin
  }
}

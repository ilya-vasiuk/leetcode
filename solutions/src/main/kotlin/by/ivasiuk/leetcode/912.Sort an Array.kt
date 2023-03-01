package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/sort-an-array/">
 *   Sort an Array</a>
 */
class SortAnArray {
  fun sortArray(nums: IntArray): IntArray =
    nums.also {
      mergeSort(it)
    }

  private fun mergeSort(nums: IntArray) {
    if (nums.size < 2) {
      return
    }

    val mid = nums.size / 2
    val left = nums.copyOfRange(0, mid)
    val right = nums.copyOfRange(mid, nums.size)

    mergeSort(left)
    mergeSort(right)

    var i = 0
    var j = 0
    var k = 0

    while (i < left.size && j < right.size) {
      if (left[i] <= right[j]) {
        nums[k++] = left[i++]
      } else {
        nums[k++] = right[j++]
      }
    }

    while (i < left.size) {
      nums[k++] = left[i++]
    }

    while (j < right.size) {
      nums[k++] = right[j++]
    }
  }
}

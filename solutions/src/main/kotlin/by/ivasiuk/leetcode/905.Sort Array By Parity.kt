package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/sort-array-by-parity/">
 *   Sort Array By Parity</a>
 */
class SortArrayByParity {
  fun sortArrayByParity(nums: IntArray): IntArray {
    var i = 0
    var j = nums.lastIndex
    var temp: Int

    while (i < j) {
      if (nums[i] % 2 == 1) {
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp

        j--
      } else {
        i++
      }
    }

    return nums
  }
}

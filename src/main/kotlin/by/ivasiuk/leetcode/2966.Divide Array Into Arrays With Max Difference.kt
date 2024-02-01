package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/">
 *   Divide Array Into Arrays With Max Difference</a>
 */
class DivideArrayIntoArraysWithMaxDifference {
  fun divideArray(nums: IntArray, k: Int): Array<IntArray> {
    val result = mutableListOf<IntArray>()
    nums.sort()

    for (i in nums.indices step 3) {
      if (nums[i + 2] - nums[i] > k) {
        return emptyArray()
      }

      result.add(intArrayOf(nums[i], nums[i + 1], nums[i + 2]))
    }

    return result.toTypedArray()
  }
}

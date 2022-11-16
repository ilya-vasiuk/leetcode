package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/largest-perimeter-triangle/">
 *   Largest Perimeter Triangle</a>
 */
class LargestPerimeterTriangle {
  fun largestPerimeter(nums: IntArray): Int {
    val sortedNums = nums.sortedDescending()

    for (i in 0 until sortedNums.size - 2) {
      if (sortedNums[i] < sortedNums[i + 1] + sortedNums[i + 2]) {
        return sortedNums[i] + sortedNums[i + 1] + sortedNums[i + 2]
      }
    }

    return 0
  }
}
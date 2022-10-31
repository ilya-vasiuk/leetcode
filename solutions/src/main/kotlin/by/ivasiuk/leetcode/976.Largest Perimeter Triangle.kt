package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/largest-perimeter-triangle/">
 *   Largest Perimeter Triangle</a>
 */
class LargestPerimeterTriangle {
  fun largestPerimeter(nums: IntArray): Int {
    val sortedNums = nums.sortedDescending()

    for (a in 0 until sortedNums.size - 2) {
      for (b in a + 1 until sortedNums.size - 1) {
        for (c in b + 1 until sortedNums.size) {
          if (sortedNums[a] < sortedNums[b] + sortedNums[c]) {
            return sortedNums[a] + sortedNums[b] + sortedNums[c]
          }
        }
      }
    }

    return 0
  }
}
package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-polygon-with-the-largest-perimeter/">
 *   Find Polygon With the Largest Perimeter</a>
 */
class FindPolygonWithTheLargestPerimeter {
  fun largestPerimeter(nums: IntArray): Long {
    nums.sort()

    var prevSum = 0L + nums[0] + nums[1]
    var max = -1L

    for (i in 2 until nums.size) {
      if (prevSum > nums[i]) {
        max = prevSum + nums[i]
      }

      prevSum += nums[i]
    }

    return max
  }
}

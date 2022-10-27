package by.ivasiuk.leetcode

import kotlin.math.max

/**
 * @see <a href="https://leetcode.com/problems/container-with-most-water/">
 *   Container With Most Water</a>
 */
class ContainerWithMostWater {
  fun maxArea(height: IntArray): Int {
    var max = 0
    var i = 0
    var j = height.size - 1

    while (i < j) {
      when {
        height[i] < height[j] -> {
          max = max(max, height[i] * (j - i))
          i++
        }
        height[i] > height[j] -> {
          max = max(max, height[j] * (j - i))
          j--
        }
        else -> {
          max = max(max, height[j] * (j - i))
          i++
          j--
        }
      }
    }

    return max
  }
}
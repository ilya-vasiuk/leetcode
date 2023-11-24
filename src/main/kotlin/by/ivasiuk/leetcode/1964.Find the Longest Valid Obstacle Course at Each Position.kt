package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-the-longest-valid-obstacle-course-at-each-position/">
 *   Find the Longest Valid Obstacle Course at Each Position</a>
 */
class FindTheLongestValidObstacleCourseAtEachPosition {
  fun longestObstacleCourseAtEachPosition(obstacles: IntArray): IntArray {
    val result = IntArray(obstacles.size) { 1 }
    val longestSub = mutableListOf(obstacles[0])

    for (i in 1 until obstacles.size) {
      if (obstacles[i] >= longestSub.last()) {
        longestSub.add(obstacles[i])
        result[i] = longestSub.size
      } else {
        binarySearch(longestSub, obstacles[i]).let {
          longestSub[it] = obstacles[i]
          result[i] = it + 1
        }
      }
    }

    return result
  }

  private fun binarySearch(list: List<Int>, target: Int): Int {
    var left = 0
    var right = list.lastIndex

    while (left < right) {
      val middle = (left + right) / 2

      if (list[middle] <= target) {
        left = middle + 1
      } else {
        right = middle
      }
    }

    return left
  }
}

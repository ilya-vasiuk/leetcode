package by.ivasiuk.leetcode

import java.util.PriorityQueue

/**
 * @see <a href="https://leetcode.com/problems/furthest-building-you-can-reach/">
 *   Furthest Building You Can Reach
 * </a>
 */
class FurthestBuildingYouCanReach {
  fun furthestBuilding(heights: IntArray, bricks: Int, ladders: Int): Int {
    val queue = PriorityQueue<Int>()
    var bricksLeft = bricks

    for (i in 1 until heights.size) {
      if (heights[i] > heights[i - 1]) {
        val diff = heights[i] - heights[i - 1]

        if (ladders != 0 && (queue.size < ladders || (queue.size == ladders && diff > queue.peek()))) {
          if (queue.size == ladders) {
            bricksLeft -= queue.poll()
          }

          queue.offer(diff)
        } else {
          bricksLeft -= diff
        }

        if (bricksLeft < 0) {
          return i - 1
        }
      }
    }

    return heights.lastIndex
  }
}

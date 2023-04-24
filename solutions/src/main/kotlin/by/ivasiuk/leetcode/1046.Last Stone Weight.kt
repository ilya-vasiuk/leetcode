package by.ivasiuk.leetcode

import java.util.PriorityQueue

/**
 * @see <a href="https://leetcode.com/problems/last-stone-weight/">
 *   Last Stone Weight</a>
 */
class LastStoneWeight {
  fun lastStoneWeight(stones: IntArray): Int {
    val queue = PriorityQueue<Int> { a, b -> b - a }
      .apply { stones.forEach { offer(it) } }

    with(queue) {
      while (size > 1) {
        val x = poll()
        val y = poll()

        when {
          x > y -> offer(x - y)
          x < y -> offer(y - x)
        }
      }

      return if (isEmpty()) 0 else peek()
    }
  }
}

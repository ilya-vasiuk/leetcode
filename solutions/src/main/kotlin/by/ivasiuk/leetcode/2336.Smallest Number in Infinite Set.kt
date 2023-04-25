package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/smallest-number-in-infinite-set/">
 *   Smallest Number in Infinite Set</a>
 */
class SmallestInfiniteSet {
  val queue = PriorityQueue<Int>(1000)
    .apply { addAll(1..1000) }
  val contains = BooleanArray(1000) { true }

  fun popSmallest(): Int {
    return if (queue.isNotEmpty()) {
      queue.poll().also {
        contains[it - 1] = false
      }
    } else {
      -1
    }
  }

  fun addBack(num: Int) {
    if (!contains[num - 1]) {
      queue.add(num)
      contains[num - 1] = true
    }
  }
}

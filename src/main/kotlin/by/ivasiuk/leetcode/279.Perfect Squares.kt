package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/perfect-squares/">Perfect Squares</a>
 */
class PerfectSquares {
  fun numSquares(n: Int): Int {
    var max = 1

    while (n >= (max + 1) * (max + 1)) max++
    val candidates = IntArray(max)

    for (i in 0 until max) {
      candidates[i] = (i + 1) * (i + 1)
    }

    val memo = mutableMapOf(n to 1)
    val queue = LinkedList<Int>()
    queue.offer(n)

    while (queue.isNotEmpty()) {
      val current = queue.pollFirst()

      if (candidates.contains(current)) {
        return memo[current]!!
      } else {
        for (candidate in candidates) {
          if (current - candidate > 0 && !memo.containsKey(current - candidate)) {
            queue.offer(current - candidate)
            memo[current - candidate] = memo[current]!! + 1
          }
        }
      }
    }

    return n
  }
}

package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/permutations-ii/">Permutations II</a>
 */
class Permutations {
  fun permute(nums: IntArray): List<List<Int>> {
    val queue = LinkedList<List<Int>>()
    queue.add(emptyList())

    while (true) {
      val size = queue.size

      for(num in 1..size) {
        val f = queue.removeFirst()

        nums.forEach {
          if(it !in f) queue.addLast(f + it)
        }
      }

      if (queue.peek().size == nums.size) break
    }

    return queue.toList()
  }
}

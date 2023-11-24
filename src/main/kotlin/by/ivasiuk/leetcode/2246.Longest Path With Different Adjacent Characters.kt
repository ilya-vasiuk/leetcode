package by.ivasiuk.leetcode

import java.util.*


/**
 * @see <a href="https://leetcode.com/problems/longest-path-with-different-adjacent-characters/">
 *   Longest Path With Different Adjacent Characters</a>
 */
class LongestPathWithDifferentAdjacentCharacters {
  private var result = 0

  fun longestPath(parent: IntArray, s: String): Int {
    result = 0
    val children = Array<ArrayList<Int>>(parent.size) { ArrayList() }
    for (i in 1 until parent.size) {
      children[parent[i]].add(i)
    }

    check(children, s, 0)

    return result
  }

  private fun check(children: Array<ArrayList<Int>>, s: String, i: Int): Int {
    val queue = PriorityQueue<Int>()

    for (j in children[i]) {
      val cur = check(children, s, j)
      if (s[j] != s[i]) {
        queue.offer(-cur)
      }
    }

    val big1 = if (queue.isEmpty()) 0 else -queue.poll()
    val big2 = if (queue.isEmpty()) 0 else -queue.poll()

    result = maxOf(result, big1 + big2 + 1)

    return big1 + 1
  }
}

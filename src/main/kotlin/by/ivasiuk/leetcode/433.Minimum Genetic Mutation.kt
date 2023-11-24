package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/minimum-genetic-mutation/">
 *   Minimum Genetic Mutation</a>
 */
class MinimumGeneticMutation {
  fun minMutation(start: String, end: String, bank: Array<String>): Int {
    if (!bank.contains(end)) {
      return -1
    }

    val genes = bank + start + end
    val routes = genes.map { it to mutableSetOf<String>() }.toMap()

    for (i in 0 until genes.size - 1) {
      for (j in i + 1 until genes.size) {
        if (isNeighbour(genes[i], genes[j])) {
          routes.getValue(genes[i]).add(genes[j])
          routes.getValue(genes[j]).add(genes[i])
        }
      }
    }


    val visited = mutableSetOf<String>()
    val queue = LinkedList<Pair<String, Int>>()
    queue.offer(Pair(start, 1))

    while (queue.isNotEmpty()) {
      val (word, step) = queue.pop()
      visited.add(word)

      if (routes.getValue(word).contains(end)) {
        return step
      } else {
        for (next in routes.getValue(word)) {
          if (!visited.contains(next)) {
            queue.offer(Pair(next, step + 1))
          }
        }
      }
    }

    return -1
  }

  private fun isNeighbour(s1: String, s2: String): Boolean {
    var diff = 0

    for (i in s1.indices) {
      if (s1[i] != s2[i]) {
        diff++
      }
    }

    return diff == 1
  }
}
package by.ivasiuk.leetcode

import java.util.*
import kotlin.collections.HashMap

/**
 * @see <a href="https://leetcode.com/problems/reconstruct-itinerary/">Reconstruct Itinerary</a>
 */
class ReconstructItinerary {
  fun findItinerary(tickets: List<List<String>>): List<String> {
    val res = mutableListOf<String>()
    val map = HashMap<String, PriorityQueue<String>>()

    tickets.forEach { (from, to) ->
      map.computeIfAbsent(from) { PriorityQueue() }.add(to)
    }

    fun visit(from: String) {
      while (map.contains(from) && map[from]!!.isNotEmpty()) {
        visit(map[from]!!.poll())
      }

      res.add(0, from)
    }

    visit("JFK")

    return res
  }
}

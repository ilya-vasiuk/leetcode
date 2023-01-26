package by.ivasiuk.leetcode


/**
 * @see <a href="https://leetcode.com/problems/cheapest-flights-within-k-stops/">
 *   Cheapest Flights Within K Stops</a>
 */
class CheapestFlightsWithinKStops {
  fun findCheapestPrice(n: Int, flights: Array<IntArray>, src: Int, dst: Int, k: Int): Int {
    var dist = Array(n) { Int.MAX_VALUE }
    dist[src] = 0

    for (i in 0..k) {
      val newDist = dist.copyOf()

      flights.forEach { (from, to, cost) ->
        if (dist[from] != Int.MAX_VALUE) {
          newDist[to] = minOf(newDist[to], dist[from] + cost)
        }
      }

      dist = newDist
    }

    return dist[dst].takeIf { it != Int.MAX_VALUE } ?: -1
  }
}

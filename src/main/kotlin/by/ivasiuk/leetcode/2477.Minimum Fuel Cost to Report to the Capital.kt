package by.ivasiuk.leetcode


/**
 * @see <a href="https://leetcode.com/problems/minimum-fuel-cost-to-report-to-the-capital/">
 *   Minimum Fuel Cost to Report to the Capital</a>
 */
class MinimumFuelCostToReportToTheCapital {
  private var fuelCost: Long = 0

  fun minimumFuelCost(roads: Array<IntArray>, seats: Int): Long {
    if (roads.isEmpty()) {
      return 0
    }

    val graph = mutableMapOf<Int, MutableList<Int>>()

    for (road in roads) {
      graph.putIfAbsent(road[0], mutableListOf())
      graph[road[0]]!!.add(road[1])
      graph.putIfAbsent(road[1], mutableListOf())
      graph[road[1]]!!.add(road[0])
    }

    fuelCost = 0

    for (city in graph[0]!!) {
      numOfChildren(graph, city, 0, seats)
    }

    return fuelCost
  }

  private fun numOfChildren(graph: Map<Int, List<Int>>, city: Int, from: Int, seats: Int): Long {
    if (graph[city]!!.size == 1) {
      fuelCost += 1
      return 1
    }

    var children = 1
    for (child in graph[city]!!) {
      if (child != from) {
        children += numOfChildren(graph, child, city, seats).toInt()
      }
    }

    fuelCost += (children + seats - 1) / seats
    return children.toLong()
  }
}

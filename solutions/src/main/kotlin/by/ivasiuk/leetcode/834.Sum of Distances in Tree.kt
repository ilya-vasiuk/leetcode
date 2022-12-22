package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/sum-of-distances-in-tree/">
 *   Sum of Distances in Tree</a>
 */
class SumOfDistancesInTree {
  fun sumOfDistancesInTree(n: Int, edges: Array<IntArray>): IntArray {
    if (n == 1) {
      return intArrayOf(0)
    }

    val nodeMapArray = Array<HashMap<Int, Pair<Int, Int>?>>(n) { hashMapOf() }

    edges.forEach { (f, l) ->
      nodeMapArray[f][l] = null
      nodeMapArray[l][f] = null
    }

    val sumOfDistances = IntArray(n)

    nodeMapArray.forEachIndexed { index, _ ->
      sumOfDistances[index] = recursive(index, nodeMapArray, BooleanArray(n))
        .let { it.second - it.first }
    }

    return sumOfDistances
  }

  private fun recursive(
    index: Int,
    nodeMapArray: Array<HashMap<Int, Pair<Int, Int>?>>,
    visited: BooleanArray
  ): Pair<Int, Int> {
    if (nodeMapArray[index].size == 1 && visited[nodeMapArray[index].keys.first()]) {
      return Pair(1, 1)
    }

    visited[index] = true

    var numberOfNodes = 0
    var sumOfNodes = 0

    nodeMapArray[index].let { nodeMap ->
      nodeMap.forEach { (key, value) ->
        if (!visited[key]) {
          if (value == null) {
            recursive(key, nodeMapArray, visited).let {
              numberOfNodes += it.first
              sumOfNodes += it.second
              nodeMap[key] = it
            }
          } else {
            numberOfNodes += value.first
            sumOfNodes += value.second
          }
        }
      }
    }

    numberOfNodes++

    return Pair(numberOfNodes, sumOfNodes + numberOfNodes)
  }
}

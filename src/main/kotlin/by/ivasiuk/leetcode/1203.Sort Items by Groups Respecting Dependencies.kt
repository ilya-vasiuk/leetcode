package by.ivasiuk.leetcode

import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.HashSet

/**
 * @see <a href="https://leetcode.com/problems/sort-items-by-groups-respecting-dependencies/">
 *   Sort Items by Groups Respecting Dependencies</a>
 */
class SortItemsByGroupsRespectingDependencies {
  fun sortItems(n: Int, m: Int, group: IntArray, beforeItems: List<List<Int>>): IntArray {
    val groups = HashMap<Int, MutableList<Int>>()

    val vAfter = HashMap<Int, HashSet<Int>>()
    val vBefore = HashMap<Int, HashSet<Int>>()
    val vQ = LinkedList<Int>()

    val gAfter = HashMap<Int, HashSet<Int>>()
    val gBefore = HashMap<Int, HashSet<Int>>()
    val gQ = LinkedList<Int>()

    val result = mutableListOf<Int>()
    val noResult = result.toIntArray()

    var newGroup = m

    for (i in group.indices) {
      group[i] = if (group[i] == -1) newGroup++ else group[i]
    }

    for (i in beforeItems.indices) {
      if (beforeItems[i].isEmpty()) {
        continue
      }

      val groupSet = HashSet<Int>()

      for (item in beforeItems[i]) {
        if (group[item] != group[i]) {
          groupSet.add(group[item])
        }

        if (!vAfter.contains(i)) {
          vAfter[i] = HashSet()
        }

        if (!vBefore.contains(item)) {
          vBefore[item] = HashSet()
        }

        vAfter[i]!!.add(item)
        vBefore[item]!!.add(i)
      }

      if (groupSet.isNotEmpty()) {
        gAfter[group[i]] = groupSet
      }
    }

    for (g in gAfter.keys) {
      for (h in gAfter[g]!!) {
        if (!gBefore.contains(h)) {
          gBefore[h] = HashSet()
        }

        gBefore[h]!!.add(g)
      }
    }

    for (v in 0 until n) {
      if (!vAfter.contains(v)) {
        vQ.addLast(v)
      }
    }

    while (vQ.isNotEmpty()) {
      val nextItem = vQ.removeFirst()

      if (!groups.contains(group[nextItem])) {
        groups[group[nextItem]] = mutableListOf()
      }

      groups[group[nextItem]]!!.add(nextItem)

      if (vBefore.contains(nextItem)) {
        for (v in vBefore[nextItem]!!) {
          vAfter[v]!!.remove(nextItem)

          if (vAfter[v]!!.isEmpty()) {
            vAfter.remove(v)
            vQ.addLast(v)
          }
        }

        vBefore.remove(nextItem)
      }
    }

    if (vBefore.isNotEmpty() || vAfter.isNotEmpty()) {
      return noResult
    }

    for (g in groups.keys) {
      if (!gAfter.contains(g)) {
        gQ.addLast(g)
      }
    }

    while (gQ.isNotEmpty()) {
      val nextGroup = gQ.removeFirst()

      result.addAll(groups[nextGroup]!!)

      if (gBefore.contains(nextGroup)) {
        for (g in gBefore[nextGroup]!!) {
          gAfter[g]!!.remove(nextGroup)

          if (gAfter[g]!!.isEmpty()) {
            gAfter.remove(g)
            gQ.addLast(g)
          }
        }

        gBefore.remove(nextGroup)
      }
    }

    if (gBefore.isNotEmpty() || gAfter.isNotEmpty()) {
      return noResult
    }

    return result.toIntArray()
  }
}

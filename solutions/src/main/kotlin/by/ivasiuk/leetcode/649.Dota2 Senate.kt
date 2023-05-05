package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/dota2-senate/">Dota2 Senate</a>
 */
class Dota2Senate {
  fun predictPartyVictory(senate: String): String {
    val radiants = LinkedList<Int>()
    val dires = LinkedList<Int>()

    for (i in senate.indices) {
      (if (senate[i] == 'R') radiants else dires).offer(i)
    }

    while (dires.isNotEmpty() && radiants.isNotEmpty()) {
      with(if (dires.first < radiants.first) dires else radiants) {
        offer(maxOf(dires.last, radiants.last) + 1)
      }

      dires.poll()
      radiants.poll()
    }

    return if (radiants.isEmpty()) "Dire" else "Radiant"
  }
}

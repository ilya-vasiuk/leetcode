package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/jump-game-iv/">Jump Game IV</a>
 */
class JumpGame4 {
  fun minJumps(arr: IntArray): Int {
    val hm = mutableMapOf<Int, MutableList<Int>>()
    val vis = BooleanArray(arr.size).also { it[0] = true }
    val q = LinkedList<Int>().also { it.offer(0) }
    var steps = 0

    for (i in arr.indices) {
      hm.putIfAbsent(arr[i], mutableListOf())
      hm[arr[i]]!!.add(i)
    }

    while (q.isNotEmpty()) {
      val size = q.size

      for (i in 0 until size) {
        val currIdx = q.poll()

        if (currIdx == arr.size - 1) {
          return steps
        }

        val available = hm[arr[currIdx]]!!
        available.add(currIdx + 1)

        if (currIdx != 0) {
          available.add(currIdx - 1)
        }

        for (next in available) {
          if (!vis[next]) {
            vis[next] = true
            q.offer(next)
          }
        }

        available.clear()
      }

      steps++
    }

    return steps
  }
}

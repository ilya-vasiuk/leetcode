package by.ivasiuk.leetcode

import kotlin.math.max
import kotlin.math.min

/**
 * @see <a href="https://leetcode.com/problems/task-scheduler/">
 *   Task Scheduler</a>
 */
class TaskScheduler {
  fun leastInterval(tasks: CharArray, n: Int): Int {
    if (tasks.isEmpty()) {
      return 0
    }

    val count = IntArray(26)
    for (c in tasks) {
      count[c - 'A']++
    }
    count.sortDescending()

    val max = count[0] - 1
    var spaces = max * n
    for (i in 1 until count.size) {
      spaces -= min(max, count[i])
    }

    return tasks.size + max(0, spaces)
  }
}
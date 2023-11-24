package by.ivasiuk.leetcode

import java.util.*


/**
 * @see <a href="https://leetcode.com/problems/single-threaded-cpu/">
 *   Single-Threaded CPU</a>
 */
class SingleThreadedCPU {
  fun getOrder(tasks: Array<IntArray>): IntArray {
    val n = tasks.size
    val arr = tasks.mapIndexed { i, task -> Task(i, task[0], task[1]) }
      .sortedBy { it.enqueueTime }
      .toTypedArray()

    val p = PriorityQueue { a: Task, b: Task ->
      if (a.processingTime == b.processingTime) {
        a.idx.compareTo(b.idx)
      } else {
        a.processingTime.compareTo(b.processingTime)
      }
    }

    val ans = IntArray(n)
    var ansIdx = 0
    var taskIdx = 0
    var curTime = 0

    while (ansIdx < n) {
      while (taskIdx < n && arr[taskIdx].enqueueTime <= curTime) {
        p.offer(arr[taskIdx++])
      }

      if (p.isEmpty()) {
        curTime = arr[taskIdx].enqueueTime
      } else {
        curTime += p.peek().processingTime
        ans[ansIdx++] = p.poll().idx
      }
    }

    return ans
  }

  internal class Task(
    val idx: Int,
    val enqueueTime: Int,
    val processingTime: Int
  )
}

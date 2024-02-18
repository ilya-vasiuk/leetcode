package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/meeting-rooms-iii/">Meeting Rooms III</a>
 */
class MeetingRooms3 {
  fun mostBooked(n: Int, meetings: Array<IntArray>): Int {
    val available = PriorityQueue<Pair<Int, Long>>(compareBy { it.first }).apply {
      repeat(n) {
        offer(Pair(it, 0))
      }
    }
    val occupied = PriorityQueue(compareBy<Pair<Int, Long>> { it.second }.thenBy { it.first })
    val count = IntArray(n)
    meetings.sortBy { it.first() }

    for ((start, end) in meetings) {
      while (occupied.isNotEmpty() && occupied.peek().second <= start) {
        available.offer(occupied.poll())
      }

      val (roomNumber, startTime) = if (available.isNotEmpty()) available.poll() else occupied.poll()

      val trulyStartTime = maxOf(startTime, start.toLong())
      val trulyEndTime = trulyStartTime + (end - start)
      occupied.offer(roomNumber to trulyEndTime)
      count[roomNumber]++
    }

    return count.indexOfFirst { it == (count.maxOrNull()!!) }
  }
}

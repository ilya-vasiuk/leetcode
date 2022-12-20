package by.ivasiuk.leetcode

import java.util.LinkedList

/**
 * @see <a href="https://leetcode.com/problems/keys-and-rooms/">Keys and Rooms</a>
 */
class KeysAndRooms {
  fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
    val visited = BooleanArray(rooms.size)
    val queue = LinkedList<Int>()
    queue.offer(0)
    var toVisit = rooms.size

    while (queue.isNotEmpty()) {
      queue.pollFirst().let {
        if (!visited[it]) {
          visited[it] = true

          if (--toVisit == 0) {
            return true
          }

          for (available in rooms[it]) {
            queue.offer(available)
          }
        }
      }
    }

    return false
  }
}

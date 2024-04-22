package by.ivasiuk.leetcode

import java.util.LinkedList


/**
 * @see <a href="https://leetcode.com/problems/open-the-lock/">Open the Lock</a>
 */
class OpenTheLock {
  fun openLock(deadends: Array<String>, target: String): Int {
    var count = 0
    val deadends = deadends.toSet()

    val queue = LinkedList<LockCode>().apply {
      offer(LockCode(0, 0, 0, 0))
    }

    val used = mutableSetOf<LockCode>()

    while (queue.isNotEmpty()) {
      repeat(queue.size) {
        val newCode = queue.poll()

        if (newCode.toString() == target) {
          return count
        }

        if (newCode.toString() !in deadends) {
          val next = newCode.generateNextLevel()

          next.forEach { code ->
            if (code.toString() == target) {
              return count + 1
            }

            if (code.toString() !in deadends && used.add(code)) {
              queue.add(code)
            }
          }
        }
      }
      count++
    }

    return -1
  }

  private fun LockCode.generateNextLevel(): List<LockCode> =
    listOf(
      copy(first = first.next()),
      copy(second = second.next()),
      copy(third = third.next()),
      copy(forth = forth.next()),
      copy(first = first.prev()),
      copy(second = second.prev()),
      copy(third = third.prev()),
      copy(forth = forth.prev())
    )

  private data class LockCode(val first: Int, val second: Int, val third: Int, val forth: Int) {
    override fun toString(): String {
      return "$first$second$third$forth"
    }
  }

  private fun Int.next(): Int = if (this == 9) 0 else (this + 1)
  private fun Int.prev(): Int = if (this == 0) 9 else (this - 1)
}

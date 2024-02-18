package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MeetingRooms3Test {
  private val solution = MeetingRooms3()

  @Test
  fun example1() {
    assertEquals(
      expected = 0,
      actual = solution.mostBooked(
        n = 2,
        meetings = arrayOf(
          intArrayOf(0, 10),
          intArrayOf(1, 5),
          intArrayOf(2, 7),
          intArrayOf(3, 4),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.mostBooked(
        n = 3,
        meetings = arrayOf(
          intArrayOf(1, 20),
          intArrayOf(2, 10),
          intArrayOf(3, 5),
          intArrayOf(4, 9),
          intArrayOf(6, 8),
        )
      )
    )
  }
}

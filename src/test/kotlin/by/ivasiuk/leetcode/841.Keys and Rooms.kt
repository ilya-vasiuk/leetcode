package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class KeysAndRoomsTest {
  private val solution = KeysAndRooms()

  @Test
  fun example1() {
    assertTrue {
      solution.canVisitAllRooms(
        rooms = listOf(
          listOf(1),
          listOf(2),
          listOf(3),
          listOf(),
        )
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.canVisitAllRooms(
        rooms = listOf(
          listOf(1, 3),
          listOf(3, 0, 1),
          listOf(2),
          listOf(0),
        )
      )
    }
  }
}

package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SeatManagerTest {
  @Test
  fun example1() {
    val seatManager = SeatManager(5)
    assertEquals(
      expected = 1,
      actual = seatManager.reserve(),
    )
    assertEquals(
      expected = 2,
      actual = seatManager.reserve(),
    )
    seatManager.unreserve(2)
    assertEquals(
      expected = 2,
      actual = seatManager.reserve(),
    )
    assertEquals(
      expected = 3,
      actual = seatManager.reserve(),
    )
    assertEquals(
      expected = 4,
      actual = seatManager.reserve(),
    )
    assertEquals(
      expected = 5,
      actual = seatManager.reserve(),
    )
    seatManager.unreserve(5)
  }
}

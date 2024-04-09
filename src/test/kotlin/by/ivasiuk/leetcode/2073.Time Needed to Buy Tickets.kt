package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class TimeNeededToBuyTicketsTest {
  private val solution = TimeNeededToBuyTickets()

  @Test
  fun example1() {
    assertEquals(
      expected = 6,
      actual = solution.timeRequiredToBuy(
        tickets = intArrayOf(2, 3, 2),
        k = 2,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 8,
      actual = solution.timeRequiredToBuy(
        tickets = intArrayOf(5, 1, 1, 1),
        k = 0,
      )
    )
  }
}

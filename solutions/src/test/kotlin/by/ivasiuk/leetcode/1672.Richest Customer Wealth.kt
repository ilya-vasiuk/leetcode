package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class RichestCustomerWealthTest {
  private val solution = RichestCustomerWealth()

  @Test
  fun example1() {
    assertEquals(
      expected = 6,
      actual = solution.maximumWealth(
        accounts = arrayOf(
          intArrayOf(1, 2, 3),
          intArrayOf(3, 2, 1),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 10,
      actual = solution.maximumWealth(
        accounts = arrayOf(
          intArrayOf(1, 5),
          intArrayOf(7, 3),
          intArrayOf(3, 5),
        )
      )
    )
  }
}

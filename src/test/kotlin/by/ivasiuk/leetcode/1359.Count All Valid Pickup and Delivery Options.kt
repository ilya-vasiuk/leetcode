package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class CountAllValidPickupAndDeliveryOptionsTest {
  private val solution = CountAllValidPickupAndDeliveryOptions()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.countOrders(
        n = 1
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 6,
      actual = solution.countOrders(
        n = 2
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 90,
      actual = solution.countOrders(
        n = 3
      )
    )
  }
}

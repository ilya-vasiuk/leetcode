package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class OrderlyQueueTest {
  private val solution = OrderlyQueue()

  @Test
  fun example1() {
    assertEquals(
      expected = "acb",
      actual = solution.orderlyQueue("cba", 1)
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "aaabc",
      actual = solution.orderlyQueue("baaca", 3)
    )
  }
}

package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class KthLargestTest {

  @Test
  fun example1() {
    val solution = KthLargest(
      k = 3,
      nums = intArrayOf(4, 5, 8, 2)
    )

    assertEquals(4, solution.add(3))
    assertEquals(5, solution.add(5))
    assertEquals(5, solution.add(10))
    assertEquals(8, solution.add(9))
    assertEquals(8, solution.add(4))
  }
}

package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SubarraysWithKDifferentIntegersTest {
  private val solution = SubarraysWithKDifferentIntegers()

  @Test
  fun example1() {
    assertEquals(
      expected = 7,
      actual = solution.subarraysWithKDistinct(
        nums = intArrayOf(1, 2, 1, 2, 3),
        k = 2,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.subarraysWithKDistinct(
        nums = intArrayOf(1, 2, 1, 3, 4),
        k = 3,
      )
    )
  }
}

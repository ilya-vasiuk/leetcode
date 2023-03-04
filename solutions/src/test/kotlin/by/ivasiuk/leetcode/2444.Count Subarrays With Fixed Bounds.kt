package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class CountSubarraysWithFixedBoundsTest {
  private val solution = CountSubarraysWithFixedBounds()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.countSubarrays(
        nums = intArrayOf(1, 3, 5, 2, 7, 5),
        minK = 1,
        maxK = 5,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 10,
      actual = solution.countSubarrays(
        nums = intArrayOf(1, 1, 1, 1),
        minK = 1,
        maxK = 1,
      )
    )
  }
}

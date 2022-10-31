package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ThreeSumClosestTest {
  private val solution = ThreeSumClosest()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.threeSumClosest(
        nums = intArrayOf(-1, 2, 1, -4),
        target = 1
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.threeSumClosest(
        nums = intArrayOf(0, 0, 0),
        target = 1
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 3,
      actual = solution.threeSumClosest(
        nums = intArrayOf(1, 1, 1, 1),
        target = 0
      )
    )
  }
}
package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ReducingDishesTest {
  private val solution = ReducingDishes()

  @Test
  fun example1() {
    assertEquals(
      expected = 14,
      actual = solution.maxSatisfaction(
        satisfaction = intArrayOf(-1, -8, 0, 5, -9)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 20,
      actual = solution.maxSatisfaction(
        satisfaction = intArrayOf(4, 3, 2)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 0,
      actual = solution.maxSatisfaction(
        satisfaction = intArrayOf(-1, -4, -5)
      )
    )
  }
}

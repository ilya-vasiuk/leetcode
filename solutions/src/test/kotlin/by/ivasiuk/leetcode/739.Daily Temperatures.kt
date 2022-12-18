package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class DailyTemperaturesTest {
  private val solution = DailyTemperatures()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(1, 1, 4, 2, 1, 1, 0, 0),
      actual = solution.dailyTemperatures(
        temperatures = intArrayOf(73, 74, 75, 71, 69, 72, 76, 73),
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(30, 40, 50, 60),
      actual = solution.dailyTemperatures(
        temperatures = intArrayOf(1, 1, 1, 0),
      )
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = intArrayOf(30, 60, 90),
      actual = solution.dailyTemperatures(
        temperatures = intArrayOf(1, 1, 0),
      )
    )
  }
}

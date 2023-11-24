package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class AverageSalaryExcludingTheMinimumAndMaximumSalaryTest {
  private val solution = AverageSalaryExcludingTheMinimumAndMaximumSalary()

  @Test
  fun example1() {
    assertEquals(
      expected = 2500.0,
      actual = solution.average(
        salary = intArrayOf(4000, 3000, 1000, 2000)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2000.0,
      actual = solution.average(
        salary = intArrayOf(1000, 2000, 3000)
      )
    )
  }
}
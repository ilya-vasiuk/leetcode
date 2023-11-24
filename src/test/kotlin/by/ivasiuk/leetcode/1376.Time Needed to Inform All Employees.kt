package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class TimeNeededToInformAllEmployeesTest {
  private val solution = TimeNeededToInformAllEmployees()

  @Test
  fun example1() {
    assertEquals(
      expected = 0,
      actual = solution.numOfMinutes(
        n = 1,
        headID = 0,
        manager = intArrayOf(-1),
        informTime = intArrayOf(0),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.numOfMinutes(
        n = 6,
        headID = 2,
        manager = intArrayOf(2, 2, -1, 2, 2, 2),
        informTime = intArrayOf(0, 0, 1, 0, 0, 0),
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 21,
      actual = solution.numOfMinutes(
        n = 7,
        headID = 6,
        manager = intArrayOf(1, 2, 3, 4, 5, 6, -1),
        informTime = intArrayOf(0, 6, 5, 4, 3, 2, 1),
      )
    )
  }
}

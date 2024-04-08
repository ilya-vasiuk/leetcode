package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfStudentsUnableToEatLunchTest {
  private val solution = NumberOfStudentsUnableToEatLunch()

  @Test
  fun example1() {
    assertEquals(
      expected = 0,
      actual = solution.countStudents(
        students = intArrayOf(1, 1, 0, 0),
        sandwiches = intArrayOf(0, 1, 0, 1),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.countStudents(
        students = intArrayOf(1, 1, 1, 0, 0, 1),
        sandwiches = intArrayOf(1, 0, 0, 0, 1, 1),
      )
    )
  }
}

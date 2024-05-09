package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximizeHappinessOfSelectedChildrenTest {
  private val solution = MaximizeHappinessOfSelectedChildren()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.maximumHappinessSum(
        happiness = intArrayOf(1, 2, 3),
        k = 2,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.maximumHappinessSum(
        happiness = intArrayOf(1, 1, 1, 1),
        k = 2,
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 5,
      actual = solution.maximumHappinessSum(
        happiness = intArrayOf(2, 3, 4, 5),
        k = 1,
      )
    )
  }
}

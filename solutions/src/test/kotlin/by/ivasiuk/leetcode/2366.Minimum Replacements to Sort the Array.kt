package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumReplacementsToSortTheArrayTest {
  private val solution = MinimumReplacementsToSortTheArray()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.minimumReplacement(
        nums = intArrayOf(3, 9, 3)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.minimumReplacement(
        nums = intArrayOf(1,2,3,4,5)
      )
    )
  }
}

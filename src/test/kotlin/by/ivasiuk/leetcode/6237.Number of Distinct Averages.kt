package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfDistinctAveragesTest {
  private val solution = NumberOfDistinctAverages()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.distinctAverages(
        nums = intArrayOf(4,1,4,0,3,5)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.distinctAverages(
        nums = intArrayOf(1, 100)
      )
    )
  }
}
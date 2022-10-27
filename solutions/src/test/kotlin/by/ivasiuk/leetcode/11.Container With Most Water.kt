package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ContainerWithMostWaterTest {
  private val solution = ContainerWithMostWater()

  @Test
  fun example1() {
    assertEquals(49, solution.maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
  }

  @Test
  fun example2() {
    assertEquals(1, solution.maxArea(intArrayOf(1, 1)))
  }
}
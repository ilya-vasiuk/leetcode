package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class IntersectionOfTwoArrays2Test {
  private val solution = IntersectionOfTwoArrays2()

  @Test
  fun example1() {
    val result = solution.intersect(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2))
    assertContentEquals(intArrayOf(2, 2), result)
  }

  @Test
  fun example2() {
    val result = solution.intersect(intArrayOf(4,9,5), intArrayOf(9,4,9,8,4))
    assertContentEquals(intArrayOf(4,9), result)
  }
}
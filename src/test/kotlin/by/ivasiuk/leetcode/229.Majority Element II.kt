package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class MajorityElement2Test {
  private val solution = MajorityElement2()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(3),
      actual = solution.majorityElement(
        nums = intArrayOf(3, 2, 3),
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(1),
      actual = solution.majorityElement(
        nums = intArrayOf(1),
      )
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = listOf(1, 2),
      actual = solution.majorityElement(
        nums = intArrayOf(1, 2),
      )
    )
  }
}

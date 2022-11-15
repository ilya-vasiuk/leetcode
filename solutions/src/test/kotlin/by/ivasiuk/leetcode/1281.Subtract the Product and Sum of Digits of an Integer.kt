package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SubtractTheProductAndSumOfDigitsOfAnIntegerTest {
  private val solution = SubtractTheProductAndSumOfDigitsOfAnInteger()

  @Test
  fun example1() {
    assertEquals(
      expected = 15,
      actual = solution.subtractProductAndSum(
        n = 234
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 21,
      actual = solution.subtractProductAndSum(
        n = 4421
      )
    )
  }
}
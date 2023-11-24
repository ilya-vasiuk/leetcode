package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class CombinationSumTest {
  private val solution = CombinationSum()

  @Test
  fun example1() {
    val expected = listOf(
      listOf(2, 2, 3),
      listOf(7),
    )
    val actual = solution.combinationSum(
      candidates = intArrayOf(2, 3, 6, 7),
      target = 7,
    )

    assertEquals(expected.size, actual.size)
    expected.forEach {
      assertContains(actual, it)
    }
  }

  @Test
  fun example2() {
    val expected = listOf(
      listOf(2, 2, 2, 2),
      listOf(2, 3, 3),
      listOf(3, 5),
    )
    val actual = solution.combinationSum(
      candidates = intArrayOf(2, 3, 5),
      target = 8,
    )

    assertEquals(expected.size, actual.size)
    expected.forEach {
      assertContains(actual, it)
    }
  }
}

package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class CombinationSum2Test {
  private val solution = CombinationSum2()

  @Test
  fun example1() {
    val expected = listOf(
      listOf(1, 1, 6),
      listOf(1, 2, 5),
      listOf(1, 7),
      listOf(2, 6),
    )
    val actual = solution.combinationSum2(
      candidates = intArrayOf(10, 1, 2, 7, 6, 1, 5),
      target = 8,
    )

    assertEquals(expected.size, actual.size)
    expected.forEach {
      assertContains(actual, it)
    }
  }

  @Test
  fun example2() {
    val expected = listOf(
      listOf(1, 2, 2),
      listOf(5),
    )
    val actual = solution.combinationSum2(
      candidates = intArrayOf(2, 5, 2, 1, 2),
      target = 5,
    )

    assertEquals(expected.size, actual.size)
    expected.forEach {
      assertContains(actual, it)
    }
  }
}

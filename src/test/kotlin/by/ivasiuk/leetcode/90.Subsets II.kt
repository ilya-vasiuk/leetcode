package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class Subsets2Test {
  private val solution = Subsets2()

  @Test
  fun example1() {
    val expected = listOf(
      listOf(),
      listOf(1),
      listOf(2),
      listOf(1, 2),
      listOf(2, 2),
      listOf(1, 2, 2),
    )

    val result = solution.subsetsWithDup(intArrayOf(1, 2, 2))

    assertEquals(expected.size, result.size)
    expected.forEach {
      assertContains(result, it)
    }
  }

  @Test
  fun example2() {
    val expected = listOf(
      listOf(),
      listOf(0),
    )

    val result = solution.subsetsWithDup(intArrayOf(0))

    assertEquals(expected.size, result.size)
    expected.forEach {
      assertContains(result, it)
    }
  }
}
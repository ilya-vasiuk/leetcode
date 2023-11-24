package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class SubsetsTest {
  private val solution = Subsets()

  @Test
  fun example1() {
    val expected = listOf(
      listOf(),
      listOf(1),
      listOf(2),
      listOf(3),
      listOf(1, 2),
      listOf(1, 3),
      listOf(2, 3),
      listOf(1, 2, 3),
    )

    val result = solution.subsets(intArrayOf(1, 2, 3))

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

    val result = solution.subsets(intArrayOf(0))

    assertEquals(expected.size, result.size)
    expected.forEach {
      assertContains(result, it)
    }
  }
}
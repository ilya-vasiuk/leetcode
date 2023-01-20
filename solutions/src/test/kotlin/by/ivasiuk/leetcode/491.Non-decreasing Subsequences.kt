package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class NonDecreasingSubsequencesTest {
  private val solution = NonDecreasingSubsequences()

  @Test
  fun example1() {
    val expected = listOf(
      listOf(4, 6),
      listOf(4, 6, 7),
      listOf(4, 6, 7, 7),
      listOf(4, 7),
      listOf(4, 7, 7),
      listOf(6, 7),
      listOf(6, 7, 7),
      listOf(7, 7)
    )

    val actual = solution.findSubsequences(
      nums = intArrayOf(4, 6, 7, 7)
    )

    assertEquals(expected.size, actual.size)
    for (i in expected.indices) {
      assertContentEquals(expected[i], actual[i])
    }
  }

  @Test
  fun example2() {
    val expected = listOf(
      listOf(4, 4)
    )

    val actual = solution.findSubsequences(
      nums = intArrayOf(4, 4, 3, 2, 1)
    )

    assertEquals(expected.size, actual.size)
    for (i in expected.indices) {
      assertContentEquals(expected[i], actual[i])
    }
  }
}

package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class PalindromePartitioningTest {
  private val solution = PalindromePartitioning()

  @Test
  fun example1() {
    val expected = listOf(
      listOf("a", "a", "b"),
      listOf("aa", "b")
    )

    val actual = solution.partition(
      s = "aab"
    )

    assertEquals(expected.size, actual.size)
    for (i in expected.indices) {
      assertContentEquals(expected[i], actual[i])
    }
  }

  @Test
  fun example2() {
    val expected = listOf(
      listOf("a")
    )

    val actual = solution.partition(
      s = "a"
    )

    assertEquals(expected.size, actual.size)
    for (i in expected.indices) {
      assertContentEquals(expected[i], actual[i])
    }
  }
}

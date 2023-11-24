package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.assertInnerCollectionsContentEquals
import kotlin.test.Test

class PalindromePartitioningTest {
  private val solution = PalindromePartitioning()

  @Test
  fun example1() {
    assertInnerCollectionsContentEquals(
      expected = listOf(
        listOf("a", "a", "b"),
        listOf("aa", "b")
      ),
      actual = solution.partition(
        s = "aab"
      )
    )
  }

  @Test
  fun example2() {
    assertInnerCollectionsContentEquals(
      expected = listOf(
        listOf("a")
      ),
      actual = solution.partition(
        s = "a"
      )
    )
  }
}

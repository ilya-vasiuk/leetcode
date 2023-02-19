package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.assertInnerCollectionsContentEquals
import kotlin.test.Test

class NonDecreasingSubsequencesTest {
  private val solution = NonDecreasingSubsequences()

  @Test
  fun example1() {
    assertInnerCollectionsContentEquals(
      expected = listOf(
        listOf(4, 6),
        listOf(4, 6, 7),
        listOf(4, 6, 7, 7),
        listOf(4, 7),
        listOf(4, 7, 7),
        listOf(6, 7),
        listOf(6, 7, 7),
        listOf(7, 7)
      ),
      actual = solution.findSubsequences(
        nums = intArrayOf(4, 6, 7, 7)
      )
    )
  }

  @Test
  fun example2() {
    assertInnerCollectionsContentEquals(
      expected = listOf(
        listOf(4, 4)
      ),
      actual = solution.findSubsequences(
        nums = intArrayOf(4, 4, 3, 2, 1)
      )
    )
  }
}

package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.assertInnerCollectionsContentEquals
import kotlin.test.Test

class FindKPairsWithSmallestSumsTest {
  private val solution = FindKPairsWithSmallestSums()

  @Test
  fun example1() {
    assertInnerCollectionsContentEquals(
      expected = listOf(
        listOf(1, 2),
        listOf(1, 4),
        listOf(1, 6),
      ),
      actual = solution.kSmallestPairs(
        nums1 = intArrayOf(1, 7, 11),
        nums2 = intArrayOf(2, 4, 6),
        k = 3
      )
    )
  }

  @Test
  fun example2() {
    assertInnerCollectionsContentEquals(
      expected = listOf(
        listOf(1, 1),
        listOf(1, 1),
      ),
      actual = solution.kSmallestPairs(
        nums1 = intArrayOf(1, 1, 2),
        nums2 = intArrayOf(1, 2, 3),
        k = 2
      )
    )
  }

  @Test
  fun example3() {
    assertInnerCollectionsContentEquals(
      expected = listOf(
        listOf(1, 3),
        listOf(2, 3),
      ),
      actual = solution.kSmallestPairs(
        nums1 = intArrayOf(1, 2),
        nums2 = intArrayOf(3),
        k = 3
      )
    )
  }
}

package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.assertInnerCollectionsContentEquals
import kotlin.test.Test

class CombinationsTest {
  private val solution = Combinations()

  @Test
  fun example1() {
    assertInnerCollectionsContentEquals(
      expected = listOf(
        listOf(1, 2),
        listOf(1, 3),
        listOf(1, 4),
        listOf(2, 3),
        listOf(2, 4),
        listOf(3, 4),
      ),
      actual = solution.combine(
        n = 4,
        k = 2,
      )
    )
  }

  @Test
  fun example2() {
    assertInnerCollectionsContentEquals(
      expected = listOf(
        listOf(1),
      ),
      actual = solution.combine(
        n = 1,
        k = 1,
      )
    )
  }
}

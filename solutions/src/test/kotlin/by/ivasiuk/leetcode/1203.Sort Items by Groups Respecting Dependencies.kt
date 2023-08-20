package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SortItemsByGroupsRespectingDependenciesTest {
  private val solution = SortItemsByGroupsRespectingDependencies()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(6, 3, 4, 5, 2, 0, 7, 1),
      actual = solution.sortItems(
        n = 8,
        m = 2,
        group = intArrayOf(-1, -1, 1, 0, 0, 1, 0, -1),
        beforeItems = listOf(
          emptyList(),
          listOf(6),
          listOf(5),
          listOf(6),
          listOf(3, 6),
          emptyList(),
          emptyList(),
          emptyList(),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(),
      actual = solution.sortItems(
        n = 8,
        m = 2,
        group = intArrayOf(-1, -1, 1, 0, 0, 1, 0, -1),
        beforeItems = listOf(
          listOf(),
          listOf(6),
          listOf(5),
          listOf(6),
          listOf(3),
          listOf(),
          listOf(4),
          listOf(),
        )
      )
    )
  }
}

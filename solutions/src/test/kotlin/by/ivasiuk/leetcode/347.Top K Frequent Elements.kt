package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class TopKFrequentElementsTest {
  private val solution = TopKFrequentElements()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(2, 1),
      actual = solution.topKFrequent(
        nums = intArrayOf(1, 1, 1, 2, 2, 3),
        k = 2,
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(1),
      actual = solution.topKFrequent(
        nums = intArrayOf(1),
        k = 1,
      )
    )
  }
}

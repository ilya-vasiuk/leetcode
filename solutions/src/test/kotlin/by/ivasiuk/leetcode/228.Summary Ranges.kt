package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SummaryRangesTest {
  private val solution = SummaryRanges()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf("0->2", "4->5", "7"),
      actual = solution.summaryRanges(
        nums = intArrayOf(0, 1, 2, 4, 5, 7)
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf("0", "2->4", "6", "8->9"),
      actual = solution.summaryRanges(
        nums = intArrayOf(0, 2, 3, 4, 6, 8, 9)
      )
    )
  }
}

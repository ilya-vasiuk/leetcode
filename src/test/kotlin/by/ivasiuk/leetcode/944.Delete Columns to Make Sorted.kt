package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class DeleteColumnsToMakeSortedTest {
  private val solution = DeleteColumnsToMakeSorted()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.minDeletionSize(
        strs = arrayOf(
          "cba",
          "daf",
          "ghi",
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.minDeletionSize(
        strs = arrayOf(
          "a",
          "b",
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 3,
      actual = solution.minDeletionSize(
        strs = arrayOf(
          "zxy",
          "wvu",
          "tsr",
        )
      )
    )
  }
}

package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class FindAllDuplicatesInAnArrayTest {
  private val solution = FindAllDuplicatesInAnArray()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf(2, 3),
      actual = solution.findDuplicates(
        nums = intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf(1),
      actual = solution.findDuplicates(
        nums = intArrayOf(1, 1, 2)
      )
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = emptyList(),
      actual = solution.findDuplicates(
        nums = intArrayOf(1)
      )
    )
  }
}

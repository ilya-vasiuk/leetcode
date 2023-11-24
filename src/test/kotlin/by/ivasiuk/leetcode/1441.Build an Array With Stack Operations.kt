package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class BuildAnArrayWithStackOperationsTest {
  private val solution = BuildAnArrayWithStackOperations()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf("Push", "Push", "Pop", "Push"),
      actual = solution.buildArray(
        target = intArrayOf(1, 3),
        n = 3
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf("Push", "Push", "Push"),
      actual = solution.buildArray(
        target = intArrayOf(1, 2, 3),
        n = 3
      )
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = listOf("Push", "Push"),
      actual = solution.buildArray(
        target = intArrayOf(1, 2),
        n = 4
      )
    )
  }
}

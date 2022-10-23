package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SetMismatchTest {
  private val solution = SetMismatch()

  @Test
  fun example1() {
    val result = solution.findErrorNums(intArrayOf(1, 2, 2, 4))

    assertContentEquals(intArrayOf(2, 3), result)
  }

  @Test
  fun example2() {
    val result = solution.findErrorNums(intArrayOf(1, 1))

    assertContentEquals(intArrayOf(1, 2), result)
  }
}

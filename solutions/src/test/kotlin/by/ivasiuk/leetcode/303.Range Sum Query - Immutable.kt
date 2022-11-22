package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumArrayTest {
  @Test
  fun example1() {
    val numArray = NumArray(
      nums = intArrayOf(-2, 0, 3, -5, 2, -1)
    )

    assertEquals(
      expected = 1,
      actual = numArray.sumRange(0, 2)
    )
    assertEquals(
      expected = -1,
      actual = numArray.sumRange(2, 5)
    )
    assertEquals(
      expected = -3,
      actual = numArray.sumRange(0, 5)
    )
  }
}

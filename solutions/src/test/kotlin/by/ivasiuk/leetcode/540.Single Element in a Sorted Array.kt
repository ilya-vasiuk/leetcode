package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SingleElementInASortedArrayTest {
  private val solution = SingleElementInASortedArray()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.singleNonDuplicate(
        nums = intArrayOf(1, 1, 2, 3, 3, 4, 4, 8, 8)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 10,
      actual = solution.singleNonDuplicate(
        nums = intArrayOf(3, 3, 7, 7, 10, 11, 11)
      )
    )
  }
}

package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FindTheOriginalArrayOfPrefixXorTest {
  private val solution = FindTheOriginalArrayOfPrefixXor()

  @Test
  fun example1() {
    assertEquals(
      expected = intArrayOf(5, 7, 2, 3, 2),
      actual = solution.findArray(
        pref = intArrayOf(5, 2, 0, 3, 1)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = intArrayOf(13),
      actual = solution.findArray(
        pref = intArrayOf(13)
      )
    )
  }
}

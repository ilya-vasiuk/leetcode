package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class PeakIndexInAMountainArrayTest {
  private val solution = PeakIndexInAMountainArray()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.peakIndexInMountainArray(
        arr = intArrayOf(0, 1, 0)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.peakIndexInMountainArray(
        arr = intArrayOf(0, 2, 1, 0)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 1,
      actual = solution.peakIndexInMountainArray(
        arr = intArrayOf(0, 10, 5, 2)
      )
    )

  }
}

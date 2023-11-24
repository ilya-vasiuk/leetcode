package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MakeArrayStrictlyIncreasingTest {
  private val solution = MakeArrayStrictlyIncreasing()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.makeArrayIncreasing(
        arr1 = intArrayOf(1,5,3,6,7),
        arr2 = intArrayOf(1,3,2,4)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.makeArrayIncreasing(
        arr1 = intArrayOf(1,5,3,6,7),
        arr2 = intArrayOf(4,3,1)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = -1,
      actual = solution.makeArrayIncreasing(
        arr1 = intArrayOf(1,5,3,6,7),
        arr2 = intArrayOf(1,6,3,3)
      )
    )
  }
}

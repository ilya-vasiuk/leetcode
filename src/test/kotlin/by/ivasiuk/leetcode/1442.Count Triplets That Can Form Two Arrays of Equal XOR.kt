package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class CountTripletsThatCanFormTwoArraysOfEqualXORTest {
  private val solution = CountTripletsThatCanFormTwoArraysOfEqualXOR()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.countTriplets(
        arr = intArrayOf(2, 3, 1, 6, 7),
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 10,
      actual = solution.countTriplets(
        arr = intArrayOf(1, 1, 1, 1, 1),
      )
    )
  }
}

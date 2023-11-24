package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class RestoreTheArrayTest {
  private val solution = RestoreTheArray()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.numberOfArrays(
        s = "1000",
        k = 10000
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.numberOfArrays(
        s = "1000",
        k = 10
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 8,
      actual = solution.numberOfArrays(
        s = "1317",
        k = 2000
      )
    )
  }
}

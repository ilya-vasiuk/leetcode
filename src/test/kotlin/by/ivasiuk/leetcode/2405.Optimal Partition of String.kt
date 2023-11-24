package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class OptimalPartitionOfStringTest {
  private val solution = OptimalPartitionOfString()

  @Test
  fun example1() {
    assertEquals(
      expected = 4,
      actual = solution.partitionString(
        s = "abacaba"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 6,
      actual = solution.partitionString(
        s = "ssssss"
      )
    )
  }
}

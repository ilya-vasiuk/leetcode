package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SnapshotArrayTest {
  @Test
  fun example1() {
    val solution = SnapshotArray(
      length = 3
    )
    solution.set(0, 5)
    assertEquals(
      expected = 0,
      actual = solution.snap()
    )
    solution.set(0, 6)
    assertEquals(
      expected = 5,
      actual = solution.get(0, 0)
    )
  }
}

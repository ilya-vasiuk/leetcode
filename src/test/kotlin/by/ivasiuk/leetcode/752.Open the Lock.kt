package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class OpenTheLockTest {
  private val solution = OpenTheLock()

  @Test
  fun example1() {
    assertEquals(
      expected = 6,
      actual = solution.openLock(
        deadends = arrayOf("0201", "0101", "0102", "1212", "2002"),
        target = "0202"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.openLock(
        deadends = arrayOf("8888"),
        target = "0009"
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = -1,
      actual = solution.openLock(
        deadends = arrayOf("8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"),
        target = "8888"
      )
    )
  }
}

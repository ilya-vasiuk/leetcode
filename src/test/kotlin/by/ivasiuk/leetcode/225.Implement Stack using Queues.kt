package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class MyStackTest {
  @Test
  fun example1() {
    val solution = MyStack()
    solution.push(1)
    solution.push(2)
    assertEquals(
      expected = 2,
      actual = solution.top()
    )
    assertEquals(
      expected = 2,
      actual = solution.pop()
    )
    assertFalse {
      solution.empty()
    }
  }
}

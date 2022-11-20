package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ToLowerCaseTest {
  private val solution = ToLowerCase()

  @Test
  fun example1() {
    assertEquals(
      expected = "hello".lowercase(),
      actual = solution.toLowerCase(
        s = "Hello"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "here",
      actual = solution.toLowerCase(
        s = "here"
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = "lovely",
      actual = solution.toLowerCase(
        s = "LOVELY"
      )
    )
  }
}

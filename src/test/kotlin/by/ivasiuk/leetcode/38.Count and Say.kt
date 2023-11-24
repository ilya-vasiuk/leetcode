package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class CountAndSayTest {
  private val solution = CountAndSay()

  @Test
  fun example1() {
    assertEquals("1", solution.countAndSay(1))
  }

  @Test
  fun example2() {
    assertEquals("1211", solution.countAndSay(4))
  }
}

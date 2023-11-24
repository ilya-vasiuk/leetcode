package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ReverseWordsInAString3Test {
  private val solution = ReverseWordsInAString3()

  @Test
  fun example1() {
    assertEquals(
      expected = "s'teL ekat edoCteeL tsetnoc",
      actual = solution.reverseWords(
        s = "Let's take LeetCode contest"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "doG gniD",
      actual = solution.reverseWords(
        s = "God Ding"
      )
    )
  }
}

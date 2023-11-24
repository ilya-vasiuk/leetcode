package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class BrowserHistoryTest {
  @Test
  fun example1() {
    val solution = BrowserHistory("leetcode.com")
    solution.visit("google.com")
    solution.visit("facebook.com")
    solution.visit("youtube.com")
    assertEquals(
      expected = "facebook.com",
      actual = solution.back(1)
    )
    assertEquals(
      expected = "google.com",
      actual = solution.back(1)
    )
    assertEquals(
      expected = "facebook.com",
      actual = solution.forward(1)
    )
    solution.visit("linkedin.com");     // You are in "facebook.com". Visit "linkedin.com"
    assertEquals(
      expected = "linkedin.com",
      actual = solution.forward(2)
    )
    assertEquals(
      expected = "google.com",
      actual = solution.back(2)
    )
    assertEquals(
      expected = "leetcode.com",
      actual = solution.back(7)
    )
  }
}

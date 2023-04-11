package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class RemovingStarsFromAStringTest {
  private val solution = RemovingStarsFromAString()

  @Test
  fun example1() {
    assertEquals(
      expected = "lecoe",
      actual = solution.removeStars(
        s = "leet**cod*e"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "",
      actual = solution.removeStars(
        s = "erase*****"
      )
    )
  }
}

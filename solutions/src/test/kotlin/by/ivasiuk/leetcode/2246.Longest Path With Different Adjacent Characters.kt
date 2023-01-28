package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestPathWithDifferentAdjacentCharactersTest {
  private val solution = LongestPathWithDifferentAdjacentCharacters()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.longestPath(
        parent = intArrayOf(-1, 0, 0, 1, 1, 2),
        s = "abacbe"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.longestPath(
        parent = intArrayOf(-1,0,0,0),
        s = "aabc"
      )
    )
  }
}

package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class ShortestPathToGetAllKeysTest {
  private val solution = ShortestPathToGetAllKeys()

  @Test
  fun example1() {
    assertEquals(
      expected = 8,
      actual = solution.shortestPathAllKeys(
        grid = arrayOf(
          "@.a..",
          "###.#",
          "b.A.B",
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 6,
      actual = solution.shortestPathAllKeys(
        grid = arrayOf(
          "@..aA",
          "..B#.",
          "....b"
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = -1,
      actual = solution.shortestPathAllKeys(
        grid = arrayOf(
          "@Aa"
        )
      )
    )
  }
}

package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class DetonateTheMaximumBombsTest {
  private val solution = DetonateTheMaximumBombs()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.maximumDetonation(
        bombs = arrayOf(
          intArrayOf(2, 1, 3),
          intArrayOf(6, 1, 4),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.maximumDetonation(
        bombs = arrayOf(
          intArrayOf(1, 1, 5),
          intArrayOf(10, 10, 5),
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 5,
      actual = solution.maximumDetonation(
        bombs = arrayOf(
          intArrayOf(1, 2, 3),
          intArrayOf(2, 3, 1),
          intArrayOf(3, 4, 2),
          intArrayOf(4, 5, 3),
          intArrayOf(5, 6, 4),
        )
      )
    )
  }
}

package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FindTheTownJudgeTest {
  private val solution = FindTheTownJudge()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.findJudge(
        n = 2,
        trust = arrayOf(
          intArrayOf(1, 2),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.findJudge(
        n = 3,
        trust = arrayOf(
          intArrayOf(1, 3),
          intArrayOf(2, 3),
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = -1,
      actual = solution.findJudge(
        n = 3,
        trust = arrayOf(
          intArrayOf(1, 3),
          intArrayOf(2, 3),
          intArrayOf(3, 1),
        )
      )
    )
  }
}

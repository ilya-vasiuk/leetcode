package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class Dota2SenateTest {
  private val solution = Dota2Senate()

  @Test
  fun example1() {
    assertEquals(
      expected = "Radiant",
      actual = solution.predictPartyVictory(
        senate = "RD"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "Dire",
      actual = solution.predictPartyVictory(
        senate = "RDD"
      )
    )
  }
}

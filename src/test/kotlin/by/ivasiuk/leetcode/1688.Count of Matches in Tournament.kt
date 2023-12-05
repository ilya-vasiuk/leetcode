package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class CountOfMatchesInTournamentTest {
  private val solution = CountOfMatchesInTournament()

  @Test
  fun example1() {
    assertEquals(
      expected = 6,
      actual = solution.numberOfMatches(
        n = 7
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 13,
      actual = solution.numberOfMatches(
        n = 14
      )
    )
  }
}

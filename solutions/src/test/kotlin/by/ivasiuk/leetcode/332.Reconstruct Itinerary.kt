package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class ReconstructItineraryTest {
  private val solution = ReconstructItinerary()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf("JFK", "MUC", "LHR", "SFO", "SJC"),
      actual = solution.findItinerary(
        tickets = listOf(
          listOf("MUC", "LHR"),
          listOf("JFK", "MUC"),
          listOf("SFO", "SJC"),
          listOf("LHR", "SFO"),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf("JFK", "ATL", "JFK", "SFO", "ATL", "SFO"),
      actual = solution.findItinerary(
        tickets = listOf(
          listOf("JFK", "SFO"),
          listOf("JFK", "ATL"),
          listOf("SFO", "ATL"),
          listOf("ATL", "JFK"),
          listOf("ATL", "SFO"),
        )
      )
    )
  }
}

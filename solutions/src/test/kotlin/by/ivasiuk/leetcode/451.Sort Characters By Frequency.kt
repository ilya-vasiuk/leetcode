package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SortCharactersByFrequencyTest {
  private val solution = SortCharactersByFrequency()

  @Test
  fun example1() {
    assertEquals(
      expected = "eetr",
      actual = solution.frequencySort("tree")
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "cccaaa",
      actual = solution.frequencySort("cccaaa")
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = "bbAa",
      actual = solution.frequencySort("Aabb")
    )
  }
}

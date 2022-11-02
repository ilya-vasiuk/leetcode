package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumGeneticMutationTest {
  private val solution = MinimumGeneticMutation()

  @Test
  fun example1() {
    assertEquals(
      expected = 1,
      actual = solution.minMutation(
        start = "AACCGGTT",
        end = "AACCGGTA",
        bank = arrayOf("AACCGGTA")
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 2,
      actual = solution.minMutation(
        start = "AACCGGTT",
        end = "AAACGGTA",
        bank = arrayOf("AACCGGTA","AACCGCTA","AAACGGTA")
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 3,
      actual = solution.minMutation(
        start = "AAAAACCC",
        end = "AACCCCCC",
        bank = arrayOf("AAAACCCC","AAACCCCC","AACCCCCC")
      )
    )
  }
}
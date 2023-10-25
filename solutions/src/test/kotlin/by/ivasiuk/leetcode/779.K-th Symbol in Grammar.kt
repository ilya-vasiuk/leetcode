package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class KthSymbolInGrammarTest {
  private val solution = KthSymbolInGrammar()

  @Test
  fun example1() {
    assertEquals(
      expected = 0,
      actual = solution.kthGrammar(
        n = 1,
        k = 1,
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 0,
      actual = solution.kthGrammar(
        n = 2,
        k = 1,
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 1,
      actual = solution.kthGrammar(
        n = 2,
        k = 2,
      )
    )
  }
}

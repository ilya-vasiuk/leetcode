package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LexicographicallySmallestEquivalentStringTest {
  private val solution = LexicographicallySmallestEquivalentString()

  @Test
  fun example1() {
    assertEquals(
      expected = "makkek",
      actual = solution.smallestEquivalentString(
        s1 = "parker",
        s2 = "morris",
        baseStr = "parser"
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "hdld",
      actual = solution.smallestEquivalentString(
        s1 = "hello",
        s2 = "world",
        baseStr = "hold"
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = "aauaaaaada",
      actual = solution.smallestEquivalentString(
        s1 = "leetcode",
        s2 = "programs",
        baseStr = "sourcecode"
      )
    )
  }

  @Test
  fun example4() {
    assertEquals(
      expected = "auqpqxmnajphtiserneattymtrydomxnwonfhfjlzzrfhosjct",
      actual = solution.smallestEquivalentString(
        s1 = "aabbbabbbbbabbbbaabaabbaaabbbabaababaaaabbbbbabbaa",
        s2 = "aabbaabbbabaababaabaababbbababbbaaaabbbbbabbbaabaa",
        baseStr = "buqpqxmnajphtisernebttymtrydomxnwonfhfjlzzrfhosjct"
      )
    )
  }
}

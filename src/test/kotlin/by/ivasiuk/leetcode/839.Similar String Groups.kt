package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SimilarStringGroupsTest {
  private val solution = SimilarStringGroups()

  @Test
  fun example1() {
    assertEquals(
      expected = 2,
      actual = solution.numSimilarGroups(
        strs = arrayOf("tars", "rats", "arts", "star")
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.numSimilarGroups(
        strs = arrayOf("omv", "ovm")
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 11,
      actual = solution.numSimilarGroups(
        strs = arrayOf(
          "qihcochwmglyiggvsqqfgjjxu",
          "gcgqxiysqfqugmjgwclhjhovi",
          "gjhoggxvcqlcsyifmqgqujwhi",
          "wqoijxciuqlyghcvjhgsqfmgg",
          "qshcoghwmglygqgviiqfjcjxu",
          "jgcxqfqhuyimjglgihvcqsgow",
          "qshcoghwmggylqgviiqfjcjxu",
          "wcoijxqiuqlyghcvjhgsqgmgf",
          "qshcoghwmglyiqgvigqfjcjxu",
          "qgsjggjuiyihlqcxfovchqmwg",
          "wcoijxjiuqlyghcvqhgsqgmgf",
          "sijgumvhqwqioclcggxgyhfjq",
          "lhogcgfqqihjuqsyicxgwmvgj",
          "ijhoggxvcqlcsygfmqgqujwhi",
          "qshcojhwmglyiqgvigqfgcjxu",
          "wcoijxqiuqlyghcvjhgsqfmgg",
          "qshcojhwmglyiggviqqfgcjxu",
          "lhogcgqqfihjuqsyicxgwmvgj",
          "xscjjyfiuglqigmgqwqghcvho",
          "lhggcgfqqihjuqsyicxgwmvoj",
          "lhgocgfqqihjuqsyicxgwmvgj",
          "qihcojhwmglyiggvsqqfgcjxu",
          "ojjycmqshgglwicfqguxvihgq",
          "sijvumghqwqioclcggxgyhfjq",
          "gglhhifwvqgqcoyumcgjjisqx"
        )
      )
    )
  }
}

package by.ivasiuk.leetcode

import kotlin.test.*

class WordBreakTest {
  private val solution = WordBreak()

  @Test
  fun example1() {
    assertTrue {
      solution.wordBreak(
        s = "leetcode",
        wordDict = listOf("leet", "code")
      )
    }
  }

  @Test
  fun example2() {
    assertTrue {
      solution.wordBreak(
        s = "applepenapple",
        wordDict = listOf("apple", "pen")
      )
    }
  }

  @Test
  fun example3() {
    assertFalse {
      solution.wordBreak(
        s = "catsandog",
        wordDict = listOf("cats", "dog", "sand", "and", "cat")
      )
    }
  }
}

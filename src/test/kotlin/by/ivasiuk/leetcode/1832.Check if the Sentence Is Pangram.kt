package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CheckIfTheSentenceIsPangramTest {
  private val solution = CheckIfTheSentenceIsPangram()

  @Test
  fun example1() {
    assertTrue {
      solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog")
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.checkIfPangram("leetcode")
    }
  }
}
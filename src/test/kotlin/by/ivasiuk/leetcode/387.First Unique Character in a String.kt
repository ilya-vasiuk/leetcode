package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FirstUniqueCharacterInAStringTest {
  private val solution = FirstUniqueCharacterInAString()

  @Test
  fun example1() {
    assertEquals(0, solution.firstUniqChar("leetcode"))
  }

  @Test
  fun example2() {
    assertEquals(2, solution.firstUniqChar("loveleetcode"))
  }

  @Test
  fun example3() {
    assertEquals(-1, solution.firstUniqChar("aabb"))
  }
}
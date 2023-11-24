package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LFUCacheTest {
  @Test
  fun example1() {
    val solution = LFUCache(2)
    solution.put(1, 1)
    solution.put(2, 2)
    assertEquals(1, solution.get(1))
    solution.put(3, 3)
    assertEquals(-1, solution.get(2))
    assertEquals(3, solution.get(3))
    solution.put(4, 4)
    assertEquals(-1, solution.get(1))
    assertEquals(3, solution.get(3))
    assertEquals(4, solution.get(4))
  }
}

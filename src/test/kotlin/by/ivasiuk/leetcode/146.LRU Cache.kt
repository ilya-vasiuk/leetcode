package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class LRUCacheTest {
  @Test
  fun example1() {
    val lRUCache = LRUCache(2)
    lRUCache.put(1, 1)
    lRUCache.put(2, 2)
    assertEquals(expected = 1, actual = lRUCache.get(1))
    lRUCache.put(3, 3)
    assertEquals(expected = -1, actual = lRUCache.get(2))
    lRUCache.put(4, 4)
    assertEquals(expected = -1, actual = lRUCache.get(1))
    assertEquals(expected = 3, actual = lRUCache.get(3))
    assertEquals(expected = 4, actual = lRUCache.get(4))
  }
}

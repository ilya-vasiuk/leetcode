package by.ivasiuk.leetcode

import kotlin.test.*

class RandomizedSetTest {
  @Test
  fun example1() {
    val set = RandomizedSet()

    assertTrue { set.insert(1) }
    assertFalse { set.remove(2) }
    assertTrue { set.insert(2) }
    assertContains(arrayOf(1, 2), set.getRandom())
    assertTrue { set.remove(1) }
    assertFalse { set.insert(2) }
    assertEquals(2, set.getRandom())
  }
}

package by.ivasiuk.leetcode

import kotlin.test.*

class MyHashSetTest {
  @Test
  fun example1() {
    val solution = MyHashSet()
    solution.add(1)
    solution.add(2)
    assertTrue { solution.contains(1) }
    assertFalse { solution.contains(3) }
    solution.add(2)
    assertTrue { solution.contains(2) }
    solution.remove(2)
    assertFalse { solution.contains(2) }
  }
}

package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class SmallestInfiniteSetTest {
  @Test
  fun example1() {
    with(SmallestInfiniteSet()) {
      addBack(2)
      assertEquals(1, popSmallest())
      assertEquals(2, popSmallest())
      assertEquals(3, popSmallest())
      addBack(1)
      assertEquals(1, popSmallest())
      assertEquals(4, popSmallest())
      assertEquals(5, popSmallest())
    }
  }
}

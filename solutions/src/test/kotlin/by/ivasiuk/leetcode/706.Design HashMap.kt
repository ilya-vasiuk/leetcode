package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class DesignHashMapTest {
  @Test
  fun example1() {
    val myHashMap = MyHashMap()
    myHashMap.put(1, 1)
    myHashMap.put(2, 2)
    assertEquals(
      expected = 1,
      actual = myHashMap.get(1)
    )
    assertEquals(
      expected = -1,
      actual = myHashMap.get(3)
    )
    myHashMap.put(2, 1)
    assertEquals(
      expected = 1,
      actual = myHashMap.get(2)
    )
    myHashMap.remove(2)
    assertEquals(
      expected = -1,
      actual = myHashMap.get(2)
    )
  }
}

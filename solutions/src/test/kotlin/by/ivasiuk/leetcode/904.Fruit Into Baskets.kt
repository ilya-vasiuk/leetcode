package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class FruitIntoBasketsTest {
  private val solution = FruitIntoBaskets()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.totalFruit(
        fruits = intArrayOf(1, 2, 1)
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 3,
      actual = solution.totalFruit(
        fruits = intArrayOf(0, 1, 2, 2)
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 4,
      actual = solution.totalFruit(
        fruits = intArrayOf(1, 2, 3, 2, 2)
      )
    )
  }
}

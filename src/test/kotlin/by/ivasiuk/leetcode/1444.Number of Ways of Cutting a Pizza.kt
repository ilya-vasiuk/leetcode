package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfWaysOfCuttingAPizzaTest {
  private val solution = NumberOfWaysOfCuttingAPizza()

  @Test
  fun example1() {
    assertEquals(
      expected = 3,
      actual = solution.ways(
        pizza = arrayOf(
          "A..",
          "AAA",
          "...",
        ),
        k = 3
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 1,
      actual = solution.ways(
        pizza = arrayOf(
          "A..",
          "AA.",
          "...",
        ),
        k = 3
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 1,
      actual = solution.ways(
        pizza = arrayOf(
          "A..",
          "A..",
          "...",
        ),
        k = 1
      )
    )
  }
}

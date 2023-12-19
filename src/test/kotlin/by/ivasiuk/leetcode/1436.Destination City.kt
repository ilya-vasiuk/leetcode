package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class DestinationCityTest {
  private val solution = DestinationCity()

  @Test
  fun example1() {
    assertEquals(
      expected = "Sao Paulo",
      actual = solution.destCity(
        paths = listOf(
          listOf("London", "New York"),
          listOf("New York", "Lima"),
          listOf("Lima", "Sao Paulo"),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = "A",
      actual = solution.destCity(
        paths = listOf(
          listOf("B", "C"),
          listOf("D", "B"),
          listOf("C", "A"),
        )
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = "Z",
      actual = solution.destCity(
        paths = listOf(
          listOf("A", "Z"),
        )
      )
    )
  }
}

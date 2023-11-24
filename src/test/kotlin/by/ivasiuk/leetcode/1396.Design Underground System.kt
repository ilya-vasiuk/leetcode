package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class UndergroundSystemTest {
  @Test
  fun example1() {
    val solution = UndergroundSystem()

    solution.checkIn(45, "Leyton", 3)
    solution.checkIn(32, "Paradise", 8)
    solution.checkIn(27, "Leyton", 10)
    solution.checkOut(45, "Waterloo", 15)
    solution.checkOut(27, "Waterloo", 20)
    solution.checkOut(32, "Cambridge", 22)
    assertEquals(
      expected = 14.0,
      actual = solution.getAverageTime("Paradise", "Cambridge")
    )
    assertEquals(
      expected = 11.0,
      actual = solution.getAverageTime("Leyton", "Waterloo")
    )
    solution.checkIn(10, "Leyton", 24)
    assertEquals(
      expected = 11.0,
      actual = solution.getAverageTime("Leyton", "Waterloo")
    )
    solution.checkOut(10, "Waterloo", 38)
    assertEquals(
      expected = 12.0,
      actual = solution.getAverageTime("Leyton", "Waterloo")
    )
  }

  @Test
  fun example2() {
    val solution = UndergroundSystem()

    solution.checkIn(10, "Leyton", 3)
    solution.checkOut(10, "Paradise", 8)
    assertEquals(
      expected = 5.0,
      actual = solution.getAverageTime("Leyton", "Paradise")
    )
    solution.checkIn(5, "Leyton", 10)
    solution.checkOut(5, "Paradise", 16)
    assertEquals(
      expected = 5.5,
      actual = solution.getAverageTime("Leyton", "Paradise")
    )
    solution.checkIn(2, "Leyton", 21)
    solution.checkOut(2, "Paradise", 30)
    assertEquals(
      expected = 6.66667,
      actual = solution.getAverageTime("Leyton", "Paradise"),
      absoluteTolerance = 1e-5
    )
  }
}

package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ParkingSystemTest {
  @Test
  fun example1() {
    val system = ParkingSystem(1, 1, 0)

    assertTrue { system.addCar(1) }
    assertTrue { system.addCar(2) }
    assertFalse { system.addCar(3) }
    assertFalse { system.addCar(1) }
  }
}

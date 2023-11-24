package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CanPlaceFlowersTest {
  private val solution = CanPlaceFlowers()

  @Test
  fun example1() {
    assertTrue {
      solution.canPlaceFlowers(
        flowerbed = intArrayOf(1, 0, 0, 0, 1),
        n = 1,
      )
    }
  }

  @Test
  fun example2() {
    assertFalse {
      solution.canPlaceFlowers(
        flowerbed = intArrayOf(1, 0, 0, 0, 1),
        n = 2,
      )
    }
  }
}

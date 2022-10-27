package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals


class ImageOverlapTest {
  private val solution = ImageOverlap()

  @Test
  fun example1() {
    val img1 = arrayOf(
      intArrayOf(1, 1, 0),
      intArrayOf(0, 1, 0),
      intArrayOf(0, 1, 0),
    )
    val img2 = arrayOf(
      intArrayOf(0, 0, 0),
      intArrayOf(0, 1, 1),
      intArrayOf(0, 0, 1),
    )

    assertEquals(3, solution.largestOverlap(img1, img2))
  }

  @Test
  fun example2() {
    val img1 = arrayOf(intArrayOf(1))
    val img2 = arrayOf(intArrayOf(1))

    assertEquals(1, solution.largestOverlap(img1, img2))
  }

  @Test
  fun example3() {
    val img1 = arrayOf(intArrayOf(0))
    val img2 = arrayOf(intArrayOf(0))

    assertEquals(0, solution.largestOverlap(img1, img2))
  }
}
package by.ivasiuk.leetcode

import kotlin.math.max
import kotlin.math.min

/**
 * @see <a href="https://leetcode.com/problems/image-overlap/">
 *   Image Overlap</a>
 */
class ImageOverlap {
  fun largestOverlap(img1: Array<IntArray>, img2: Array<IntArray>): Int {
    val m1: Int = img1.size
    val m2: Int = img2.size
    val n1: Int = img1[0].size
    val n2: Int = img2[0].size
    var max = Int.MIN_VALUE

    for (r in 0 until m1 + m2 - 1) {
      val i = m1 - 1 + min(0, m2 - 1 - r)
      val x = r + min(0, m2 - 1 - r)

      for (c in 0 until n1 + n2 - 1) {
        val j = n1 - 1 + min(0, n2 - 1 - c)
        val y = c + min(0, n2 - 1 - c)

        max = max(max, overlap(img1, img2, i, j, x, y))
      }
    }
    return max
  }

  private fun overlap(
    img1: Array<IntArray>,
    img2: Array<IntArray>,
    i1: Int,
    j1: Int,
    i2: Int,
    j2: Int
  ): Int {
    var count = 0
    var i = i1
    var x = i2

    while (i >= 0 && x >= 0) {
      var j = j1
      var y = j2

      while (j >= 0 && y >= 0) {
        if (img1[i][j] == img2[x][y]) {
          if (img1[i][j] == 1) count++
        }
        j--
        y--
      }
      i--
      x--
    }

    return count
  }
}
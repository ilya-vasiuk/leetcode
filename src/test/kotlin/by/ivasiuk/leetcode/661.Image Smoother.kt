package by.ivasiuk.leetcode

import by.ivasiuk.leetcode.common.assertInnerCollectionsContentEquals
import kotlin.test.Test

class ImageSmootherTest {
  private val solution = ImageSmoother()

  @Test
  fun example1() {
    assertInnerCollectionsContentEquals(
      expected = arrayOf(
        intArrayOf(0, 0, 0),
        intArrayOf(0, 0, 0),
        intArrayOf(0, 0, 0),
      ),
      actual = solution.imageSmoother(
        img = arrayOf(
          intArrayOf(1, 1, 1),
          intArrayOf(1, 0, 1),
          intArrayOf(1, 1, 1),
        )
      )
    )
  }

  @Test
  fun example2() {
    assertInnerCollectionsContentEquals(
      expected = arrayOf(
        intArrayOf(137, 141, 137),
        intArrayOf(141, 138, 141),
        intArrayOf(137, 141, 137),
      ),
      actual = solution.imageSmoother(
        img = arrayOf(
          intArrayOf(100, 200, 100),
          intArrayOf(200, 50, 200),
          intArrayOf(100, 200, 100),
        )
      )
    )
  }
}

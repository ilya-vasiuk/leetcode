package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertContentEquals

class ShuffleAnArrayTest {
  @Test
  fun example1() {
    val original = intArrayOf(1, 2, 3)
    val solution = ShuffleAnArray(original)

    solution.shuffle().forEach {
      assertContains(original, it)
    }

    assertContentEquals(
      expected = original,
      actual = solution.reset()
    )

    solution.shuffle().forEach {
      assertContains(original, it)
    }
  }
}

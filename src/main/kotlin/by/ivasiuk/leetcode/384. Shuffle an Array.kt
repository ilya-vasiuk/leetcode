package by.ivasiuk.leetcode

import kotlin.random.Random

/**
 * @see <a href="https://leetcode.com/problems/shuffle-an-array/">Shuffle an Array</a>
 */
class ShuffleAnArray(nums: IntArray) {
  private val original = nums
  private var operational = nums.clone()
  private val size = nums.size
  private val random = Random(size)

  fun reset(): IntArray {
    operational = original.clone()

    return operational
  }

  fun shuffle(): IntArray {
    for (i in 0 until size) {
      val j = random.nextInt(i + 1)
      val copy = operational[i]
      operational[i] = operational[j]
      operational[j] = copy
    }

    return operational
  }
}

package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/shuffle-the-array/">
 *   Shuffle the Array</a>
 */
class ShuffleTheArray {
  fun shuffle(nums: IntArray, n: Int): IntArray {
    val result = IntArray(2 * n)

    for (i in 0 until n) {
      result[i * 2] = nums[i]
      result[i * 2 + 1] = nums[n + i]
    }

    return result
  }
}

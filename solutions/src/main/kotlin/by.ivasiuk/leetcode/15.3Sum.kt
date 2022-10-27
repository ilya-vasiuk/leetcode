package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/3sum/">
 *   3Sum</a>
 */
class ThreeSum {
  fun threeSum(nums: IntArray): List<List<Int>> {
    val (size, processedNums) = cleanupNums(nums.sortedArray())

    val result = mutableSetOf<List<Int>>()

    for (i in 0 until size - 2) {
      var j = i + 1
      var k = size - 1
      while (j < k) {
        val sum = processedNums[i] + processedNums[j] + processedNums[k]
        when {
          sum < 0 -> j++
          sum > 0 -> k--
          else -> result.add(listOf(processedNums[i], processedNums[j++], processedNums[k--]))
        }
      }
    }

    return result.toList()
  }

  private fun cleanupNums(nums: IntArray): Pair<Int, IntArray> {
    val processedNums = IntArray(nums.size)
    var i = 0
    for (j in nums.indices) {
      if (i < 3 ||
        processedNums[i - 3] != nums[j] ||
        processedNums[i - 2] != nums[j] ||
        processedNums[i - 1] != nums[j]
      ) {
        processedNums[i++] = nums[j]
      }
    }

    return Pair(i, processedNums)
  }
}
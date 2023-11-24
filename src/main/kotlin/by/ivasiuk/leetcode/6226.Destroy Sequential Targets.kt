package by.ivasiuk.leetcode

import kotlin.math.abs

/**
 * @see <a href="https://leetcode.com/problems/destroy-sequential-targets/">
 *   Destroy Sequential Targets</a>
 */
//TODO: Not accepted
class DestroySequentialTargets {
  fun destroyTargets(nums: IntArray, space: Int): Int {
    val diff = IntArray(nums.size)
    val cache = mutableMapOf<Int, Int>()

    for (i in nums.indices) {
      if (cache.containsKey(nums[i])) {
        diff[i] = cache[nums[i]]!!
      } else {
        var current = 0

        for (j in nums.indices) {
          if (abs(nums[j] - nums[i]) % space == 0) {
            current++
          }
        }

        diff[i] = current
        cache[nums[i]] = current
      }
    }

    var max = 0
    var minSeed = Int.MAX_VALUE

    for (i in diff.indices) {
      if (diff[i] > max) {
        max = diff[i]
        minSeed = nums[i]
      } else if (diff[i] == max && nums[i] < minSeed) {
        minSeed = nums[i]
      }
    }

    return minSeed
  }
}
package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/combination-sum-iv/">Combination Sum IV</a>
 */
class CombinationSum4 {
  fun combinationSum4(nums: IntArray, target: Int): Int {
    val combinations = IntArray(target + 1).also { it[0] = 1 }

    for (value in 1..target) {
      for (num in nums) {
        if (value - num >= 0) {
          combinations[value] = combinations[value] + combinations[value - num]
        }
      }
    }


    return combinations[target]
  }
}

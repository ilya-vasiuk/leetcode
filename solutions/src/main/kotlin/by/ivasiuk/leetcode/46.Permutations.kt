package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/permutations-ii/">Permutations II</a>
 */
class Permutations {
  fun permute(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()

    generate(nums, emptyList(), nums.size, result)

    return result
  }

  private fun generate(
    nums: IntArray,
    combination: List<Int>,
    size: Int,
    result: MutableList<List<Int>>
  ) {
    if (combination.size == size) {
      result.add(combination)
    } else {
      for (num in nums) {
        if (!combination.contains(num)) {
          generate(nums, combination + num, size, result)
        }
      }
    }
  }
}

package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/permutations-ii/">Permutations II</a>
 */
class Permutations2 {
  fun permuteUnique(nums: IntArray): List<List<Int>> {
    val availability = nums.toList().groupingBy { it }.eachCount().toMutableMap()
    val result = mutableListOf<List<Int>>()

    generate(nums.toSet(), availability, emptyList(), nums.size, result)

    return result
  }

  private fun generate(
    nums: Set<Int>,
    availability: MutableMap<Int, Int>,
    combination: List<Int>,
    size: Int,
    result: MutableList<List<Int>>
  ) {
    if (combination.size == size) {
      result.add(combination)
    } else {
      for (num in nums) {
        if (availability[num]!! > 0) {
          availability[num] = availability[num]!! - 1
          generate(nums, availability, combination + num, size, result)
          availability[num] = availability[num]!! + 1
        }
      }
    }
  }
}

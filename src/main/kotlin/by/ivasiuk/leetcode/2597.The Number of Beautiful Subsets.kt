package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/the-number-of-beautiful-subsets/">
 *   The Number of Beautiful Subsets</a>
 */
class TheNumberOfBeautifulSubsets {
  fun beautifulSubsets(nums: IntArray, k: Int): Int {
    val visited = mutableMapOf<Int, Int>()
    var count = 0

    fun explore(index: Int) {
      if (index == nums.size) {
        count++
        return
      }

      val num = nums[index]

      if (!visited.containsKey(num - k) && !visited.containsKey(num + k)) {
        visited[num] = visited.getOrDefault(num, 0) + 1
        explore(index + 1)
        visited[num] = visited[num]!! - 1

        if (visited[num] == 0) {
          visited.remove(num)
        }
      }

      explore(index + 1)
    }

    explore(0)

    return count - 1
  }
}

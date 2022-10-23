package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/set-mismatch/">
 *   Set Mismatch</a>
 */
class SetMismatch {
  fun findErrorNums(nums: IntArray): IntArray {
    val counter = IntArray(nums.size)

    for (n in nums) {
      counter[n - 1]++
    }

    var duplicate: Int = -1
    var absent: Int = -1
    var i = 0

    while (duplicate == -1 || absent == -1) {
      if (counter[i] == 0) {
        absent = i + 1
      } else if(counter[i] == 2) {
        duplicate = i + 1
      }

      i++
    }

    return intArrayOf(duplicate, absent)
  }
}
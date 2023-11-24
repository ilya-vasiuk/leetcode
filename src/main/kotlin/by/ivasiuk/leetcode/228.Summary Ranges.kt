package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/summary-ranges/">
 *   Summary Ranges</a>
 */
class SummaryRanges {
  fun summaryRanges(nums: IntArray): List<String> {
    if (nums.isEmpty()) {
      return emptyList()
    }

    var start = nums[0]
    var end = nums[0]
    val result = mutableListOf<String>()

    for (i in 1 until nums.size) {
      if (nums[i] - 1 == end) {
        end++
      } else {
        result.add(if (start == end) "$start" else "$start->$end")
        start = nums[i]
        end = nums[i]
      }
    }

    result.add(if (start == end) "$start" else "$start->$end")

    return result
  }
}

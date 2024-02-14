package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/rearrange-array-elements-by-sign/description/">
 *   Rearrange Array Elements by Sign</a>
 */
class RearrangeArrayElementsBySign {
  fun rearrangeArray(nums: IntArray): IntArray {
    val res = IntArray(nums.size)

    var positive = -1
    var negative = 0

    nums.forEach {
      if (it > 0) {
        positive++
        res[positive] = it
        positive++
      } else {
        negative++
        res[negative] = it
        negative++
      }
    }

    return res
  }
}

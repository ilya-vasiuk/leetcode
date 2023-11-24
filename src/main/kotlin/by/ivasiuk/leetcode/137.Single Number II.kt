package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/single-number-ii/">Single Number II</a>
 */
class SingleNumber2 {
  fun singleNumber(nums: IntArray): Int =
    with(mutableMapOf<Int, Int>()) {
      nums.forEach { num ->
        getOrDefault(num, 0).let { curr ->
          if (curr == 2) remove(num) else set(num, curr + 1)
        }
      }

      keys.single()
    }
}

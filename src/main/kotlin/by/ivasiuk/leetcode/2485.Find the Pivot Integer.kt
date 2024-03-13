package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-the-pivot-integer/">Find the Pivot Integer</a>
 */
class FindThePivotInteger {
  fun pivotInteger(n: Int): Int {
    var left = 1
    var leftSum = 1
    var right = n
    var rightSum = n

    while (left <= right) {
      when {
        leftSum == rightSum && left == right -> return left
        leftSum < rightSum -> leftSum += ++left
        else -> rightSum += --right
      }
    }

    return -1
  }
}

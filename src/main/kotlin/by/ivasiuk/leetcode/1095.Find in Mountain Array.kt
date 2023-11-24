package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-in-mountain-array/">
 *   Find in Mountain Array</a>
 */
class FindInMountainArray {
  fun findInMountainArray(target: Int, mountainArr: MountainArray): Int {
    var left = 1
    var right = mountainArr.length() - 1
    var top = -1

    while (left <= right) {
      val mid = (left + right) / 2

      if (mountainArr.get(mid - 1) < mountainArr.get(mid)) {
        top = maxOf(top, mid)
        left = mid + 1
      } else {
        right = mid - 1
      }
    }

    left = 0
    right = top

    while (left <= right) {
      val mid = (left + right) / 2
      val m = mountainArr.get(mid)

      when {
        m < target -> left = mid + 1
        m > target -> right = mid - 1
        else -> return mid
      }
    }

    left = top
    right = mountainArr.length() - 1

    while (left <= right) {
      val mid = (left + right) / 2
      val m = mountainArr.get(mid)

      when {
        m < target -> right = mid - 1
        m > target -> left = mid + 1
        else -> return mid
      }
    }

    return -1
  }

  interface MountainArray {
    fun get(index: Int): Int
    fun length(): Int
  }
}

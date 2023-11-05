package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/find-the-winner-of-an-array-game/">
 *   Find the Winner of an Array Game</a>
 */
class FindTheWinnerOfAnArrayGame {
  fun getWinner(arr: IntArray, k: Int): Int {
    var result = arr[0]
    var count = 0

    for (i in 1 until arr.size) {
      count++

      if (arr[i] >= result) {
        count = 1
        result = arr[i]
      }

      if (count >= k) {
        break
      }
    }

    return result
  }
}

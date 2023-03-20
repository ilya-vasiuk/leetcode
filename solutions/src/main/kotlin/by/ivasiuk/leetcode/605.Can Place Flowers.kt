package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/can-place-flowers/">Can Place Flowers</a>
 */
class CanPlaceFlowers {
  fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var zeros = 0
    var counter = 0

    for (i in flowerbed.indices) {
      if (flowerbed[i] == 0) {
        zeros++
      } else {
        counter += if (zeros == i) zeros / 2 else (zeros - 1) / 2
        zeros = 0

        if (counter >= n) {
          return true
        }
      }
    }

    if (zeros > 0) {
      counter += if (zeros == flowerbed.size) (zeros + 1) / 2 else zeros / 2
    }

    return counter >= n
  }
}

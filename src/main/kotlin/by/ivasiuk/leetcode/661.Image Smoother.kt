package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/image-smoother/">Image Smoother</a>
 */
class ImageSmoother {
  fun imageSmoother(img: Array<IntArray>): Array<IntArray> {
    val m = img.size
    val n = img[0].size
    val result = Array(m) { IntArray(n) }

    fun smooth(x: Int, y: Int): Int {
      var count = 0
      var sum = 0
      for (i in maxOf(0, x - 1)..minOf(x + 1, m - 1)) {
        for (j in maxOf(0, y - 1)..minOf(y + 1, n - 1)) {
          sum += img[i][j]
          count++
        }
      }

      return sum / count
    }


    for (i in 0 until m) {
      for (j in 0 until n) {
        result[i][j] = smooth(i, j)
      }
    }

    return result
  }
}

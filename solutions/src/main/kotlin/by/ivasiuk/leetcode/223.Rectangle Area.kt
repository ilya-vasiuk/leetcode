package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/rectangle-area/">Rectangle Area</a>
 */
class RectangleArea {
  fun computeArea(ax1: Int, ay1: Int, ax2: Int, ay2: Int, bx1: Int, by1: Int, bx2: Int, by2: Int): Int {
    val x = minOf(ax2, bx2) - maxOf(ax1, bx1)
    val y = minOf(ay2, by2) - maxOf(ay1, by1)
    val overlap = if (x > 0 && y > 0) x * y else 0

    return squareOf(ax1, ay1, ax2, ay2) + squareOf(bx1, by1, bx2, by2) - overlap
  }

  private fun squareOf(x1: Int, y1: Int, x2: Int, y2: Int): Int = (x2 - x1) * (y2 - y1)
}

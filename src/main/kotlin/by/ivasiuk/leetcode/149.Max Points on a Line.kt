package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/max-points-on-a-line/">
 *   Max Points on a Line</a>
 */
class MaxPointsOnALine {
  fun maxPoints(points: Array<IntArray>): Int {
    if (points.size < 3) {
      return points.size
    }

    val lines = mutableMapOf<Pair<Int, Int>, Int>()
    var result = 0

    for (i in 0 until points.size - 1) {
      lines.clear()
      var duplicates = 0
      var max = 0

      for (j in i + 1 until points.size) {
        var x = points[j][0] - points[i][0]
        var y = points[j][1] - points[i][1]

        if (x == 0 && y == 0) {
          duplicates++
          continue
        }

        val gcd = gcd(x, y)
        if (gcd != 0) {
          x /= gcd
          y /= gcd
        }

        val point = Pair(x, y)
        lines[point] = lines.getOrDefault(point, 0) + 1

        max = maxOf(max, lines.getValue(point))
      }

      result = maxOf(result, max + duplicates + 1)
    }

    return result
  }

  private fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a.rem(b))
}

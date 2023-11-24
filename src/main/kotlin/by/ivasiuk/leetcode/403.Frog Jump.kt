package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/frog-jump/">Frog Jump</a>
 */
class FrogJump {
  fun canCross(stones: IntArray): Boolean {
    val map = mutableMapOf<Int, MutableSet<Int>>()

    map[stones[0] + 1] = mutableSetOf(1)
    for (i in 1 until stones.lastIndex) {
      val stone = stones[i]

      map[stone]?.let { set ->
        set.forEach { k ->
          for (j in k - 1 .. k + 1) {
            map[stone + j] = map.computeIfAbsent(stone + j) { mutableSetOf() }.also { it.add(j) }
          }
        }
      }
    }

    return map.contains(stones[stones.lastIndex])
  }
}

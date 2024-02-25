package by.ivasiuk.leetcode

import kotlin.math.sqrt

/**
 * @see <a href="https://leetcode.com/problems/greatest-common-divisor-traversal/">
 *   Greatest Common Divisor Traversal</a>
 */
class GreatestCommonDivisorTraversal {
  fun canTraverseAllPairs(nums: IntArray): Boolean {
    if (nums.contains(1)) {
      return nums.size == 1
    }

    val nums = nums.toSet().toList()
    val p = BooleanArray(nums.max() + 1) { true }

    for (i in 2..sqrt(p.size.toDouble()).toInt()) {
      if (p[i]) {
        for (j in i * i until p.size step i) {
          p[j] = false
        }
      }
    }

    val primes = (2 until p.size).filter { p[it] }
    val uf = IntArray(primes.size) { it }

    fun Int.root(): Int {
      var x = this

      while (x != uf[x]) {
        x = uf[x]
      }

      uf[this] = x

      return x
    }

    val islands = HashSet<Int>()

    for (x in nums) {
      var prev = -1

      for (i in primes.indices) {
        if (x % primes[i] == 0) {
          islands += i

          if (prev != -1) {
            uf[prev.root()] = i.root()
          }

          prev = i
        }
      }
    }
    val oneOf = islands.firstOrNull()?.root() ?: -1
    return islands.all { it.root() == oneOf }
  }
}

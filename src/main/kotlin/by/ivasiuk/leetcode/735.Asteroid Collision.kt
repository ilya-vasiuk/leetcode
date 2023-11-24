package by.ivasiuk.leetcode

import java.util.Stack
import kotlin.math.abs

/**
 * @see <a href="https://leetcode.com/problems/asteroid-collision/">Asteroid Collision</a>
 */
class AsteroidCollision {
  fun asteroidCollision(asteroids: IntArray): IntArray {
    val result = Stack<Int>()
    var i = 0

    while(i < asteroids.size) {
      if (result.isEmpty()) {
        result.push(asteroids[i])
      } else {
        val curr = asteroids[i]
        val prev = result.peek()

        if (prev > 0 && curr < 0 && prev + curr == 0) {
          result.pop()
        } else if (!(prev > 0 && curr < 0)) {
          result.push(curr)
        } else if (abs(curr) > abs(prev)) {
          result.pop()
          i--
        }
      }

      i++
    }

    return result.toIntArray()
  }
}

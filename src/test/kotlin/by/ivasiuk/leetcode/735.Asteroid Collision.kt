package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class AsteroidCollisionTest {
  private val solution = AsteroidCollision()

  @Test
  fun example1() {
    assertContentEquals(
      expected = intArrayOf(5, 10),
      actual = solution.asteroidCollision(
        asteroids = intArrayOf(5, 10, -5)
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = intArrayOf(),
      actual = solution.asteroidCollision(
        asteroids = intArrayOf(8, -8)
      )
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = intArrayOf(10),
      actual = solution.asteroidCollision(
        asteroids = intArrayOf(10, 2, -5)
      )
    )
  }

  @Test
  fun example4() {
    assertContentEquals(
      expected = intArrayOf(-2, -1, 1, 2),
      actual = solution.asteroidCollision(
        asteroids = intArrayOf(-2, -1, 1, 2)
      )
    )
  }
}
package by.ivasiuk.leetcode


/**
 * @see <a href="https://leetcode.com/problems/fruit-into-baskets/">
 *   Fruit Into Baskets</a>
 */
class FruitIntoBaskets {
  fun totalFruit(fruits: IntArray): Int {
    val basket = mutableMapOf<Int, Int>()
    var start = 0
    var result = 0

    for (i in fruits.indices) {
      basket[fruits[i]] = 1 + (basket[fruits[i]] ?: 0)

      while (basket.size > 2) {
        basket[fruits[start]] = basket[fruits[start]]!! - 1
        basket.remove(fruits[start++], 0)
      }

      result = maxOf(result, i - start + 1)
    }

    return result
  }
}

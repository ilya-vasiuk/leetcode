package by.ivasiuk.leetcode

import java.util.*
import kotlin.collections.HashMap

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">
 *   Design a Food Rating System</a>
 */
class FoodRatings(foods: Array<String>, cuisines: Array<String>, ratings: IntArray) {
  private val map = HashMap<String, TreeSet<Pair<String, Int>>>()
  private val indexFood = HashMap<String, Int>()
  private val cuisinesArray: Array<String> = cuisines.copyOf()
  private val ratingsArray: IntArray = ratings.copyOf()

  init {
    for (i in foods.indices) {
      map
        .getOrPut(cuisines[i]) { TreeSet(compareBy({ -it.second }, { it.first })) }
        .add(Pair(foods[i], ratings[i]))

      indexFood[foods[i]] = i
    }
  }

  fun changeRating(food: String, newRating: Int) {
    val index = indexFood.getValue(food)
    val cuisine = cuisinesArray[index]

    map.getValue(cuisine).removeIf { it.first == food }
    map.getValue(cuisine).add(Pair(food, newRating))
    ratingsArray[index] = newRating
  }

  fun highestRated(cuisine: String): String {
    return map.getValue(cuisine).first().first
  }
}

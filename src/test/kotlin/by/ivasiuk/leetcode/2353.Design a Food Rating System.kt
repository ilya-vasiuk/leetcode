package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class DesignAFoodRatingSystem {
  @Test
  fun example1() {
    val foodRatings = FoodRatings(
      foods = arrayOf("kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"),
      cuisines = arrayOf("korean", "japanese", "japanese", "greek", "japanese", "korean"),
      ratings = intArrayOf(9, 12, 8, 15, 14, 7)
    )

    assertEquals(
      expected = "kimchi",
      actual = foodRatings.highestRated("korean"),
    )
    assertEquals(
      expected = "ramen",
      actual = foodRatings.highestRated("japanese"),
    )

    foodRatings.changeRating("sushi", 16)

    assertEquals(
      expected = "sushi",
      actual = foodRatings.highestRated("japanese")
    )

    foodRatings.changeRating("ramen", 16)

    assertEquals(
      expected = "ramen",
      actual = foodRatings.highestRated("japanese")
    )
  }

  @Test
  fun example2() {
    val foodRatings = FoodRatings(
      foods = arrayOf("emgqdbo", "jmvfxjohq", "qnvseohnoe", "yhptazyko", "ocqmvmwjq"),
      cuisines = arrayOf("snaxol", "snaxol", "snaxol", "fajbervsj", "fajbervsj"),
      ratings = intArrayOf(2, 6, 18, 6, 5)
    )

    foodRatings.changeRating("qnvseohnoe", 11)

    assertEquals(
      expected = "yhptazyko",
      actual = foodRatings.highestRated("fajbervsj"),
    )

    foodRatings.changeRating("emgqdbo", 3)
    foodRatings.changeRating("jmvfxjohq", 9)
    foodRatings.changeRating("emgqdbo", 14)

    assertEquals(
      expected = "yhptazyko",
      actual = foodRatings.highestRated("fajbervsj")
    )

    assertEquals(
      expected = "emgqdbo",
      actual = foodRatings.highestRated("snaxol")
    )
  }
}

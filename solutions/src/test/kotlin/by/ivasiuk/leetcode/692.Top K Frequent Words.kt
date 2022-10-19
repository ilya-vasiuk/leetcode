package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class TopKFrequentWordsTest {
  private val solution = TopKFrequentWords()

  @Test
  fun example1() {
    val result = solution.topKFrequent(
      words = arrayOf("i", "love", "leetcode", "i", "love", "coding"),
      k = 2
    )
    assertContentEquals(listOf("i", "love"), result)
  }

  @Test
  fun example2() {
    val result = solution.topKFrequent(
      words = arrayOf("the","day","is","sunny","the","the","the","sunny","is","is"),
      k = 4
    )
    assertContentEquals(listOf("the","is","sunny","day"), result)
  }
}
package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/top-k-frequent-words/">
 *   Top K Frequent Words</a>
 */
class TopKFrequentWords {
  fun topKFrequent(words: Array<String>, k: Int): List<String> {
    val map = mutableMapOf<String, Int>()
    for (word in words) {
      map[word] = map.getOrDefault(word, 0) + 1
    }

    val result = map.entries
      .sortedWith(compareByDescending<Map.Entry<String, Int>> { it.value }.thenBy {it.key})
      .map { it.key }

    return result.subList(0, k)
  }
}
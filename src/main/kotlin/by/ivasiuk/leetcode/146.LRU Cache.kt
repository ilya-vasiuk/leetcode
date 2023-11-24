package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/lru-cache/">
 *   LRU Cache</a>
 */
class LRUCache(capacity: Int) {
  private val nodes = object : LinkedHashMap<Int, Int>(capacity, 0.75f, true) {
    override fun removeEldestEntry(eldest: MutableMap.MutableEntry<Int, Int>?) = size > capacity
  }

  fun get(key: Int) = nodes.getOrDefault(key, -1)

  fun put(key: Int, value: Int) {
    nodes[key] = value
  }
}

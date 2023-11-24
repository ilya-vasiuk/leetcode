package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/design-hashmap/">
 *   Design HashMap</a>
 */
class MyHashMap {
  val map = Array(SIZE) { mutableListOf<Pair<Int, Int>>() }

  fun put(key: Int, value: Int) {
    val list = map[key / SIZE]

    list.removeIf { it.first == key }
    list.add(key to value)
  }

  fun get(key: Int): Int {
    val list = map[key / SIZE]

    return list.find { it.first == key }?.second ?: -1
  }

  fun remove(key: Int) {
    val list = map[key / SIZE]

    list.removeIf { it.first == key }
  }

  companion object {
    private const val SIZE = 1000
  }
}

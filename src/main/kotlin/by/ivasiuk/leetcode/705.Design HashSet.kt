package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/design-hashset/">
 *   Design HashSet</a>
 */
class MyHashSet {
  private val arr = BooleanArray(1_000_001)

  fun add(key: Int) {
    arr[key] = true
  }

  fun remove(key: Int) {
    arr[key] = false
  }

  fun contains(key: Int): Boolean = arr[key]
}

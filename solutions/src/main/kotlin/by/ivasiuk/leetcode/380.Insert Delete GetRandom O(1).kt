package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/insert-delete-getrandom-o1/">
 *   Insert Delete GetRandom O(1)</a>
 */
class RandomizedSet {
  private val indices = mutableMapOf<Int, Int>()
  private val values = mutableListOf<Int>()

  fun insert(`val`: Int): Boolean {
    if (`val` in indices) {
      return false
    }

    values.add(`val`)
    indices[`val`] = values.size - 1

    return true
  }

  fun remove(`val`: Int): Boolean {
    return indices[`val`]?.let {
      indices[values.last()] = it
      values[it] = values.last()

      indices.remove(`val`)
      values.removeAt(values.size - 1)

      true
    } ?: false
  }

  fun getRandom() = values.random()
}

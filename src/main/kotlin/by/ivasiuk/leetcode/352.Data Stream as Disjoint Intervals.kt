package by.ivasiuk.leetcode

import java.util.*


/**
 * @see <a href="https://leetcode.com/problems/two-sum/">
 *   Data Stream as Disjoint Intervals</a>
 */
class DataStreamAsDisjointIntervals {
  private val tree = TreeMap<Int, IntArray>()

  fun addNum(value: Int) {
    if (!tree.containsKey(value)) {
      val l = tree.lowerKey(value)
      val h = tree.higherKey(value)

      if (l != null && h != null && tree[l]!![1] + 1 == value && h == value + 1) {
        tree[l]!![1] = tree[h]!![1]
        tree.remove(h)
      } else if (l != null && tree[l]!![1] + 1 >= value) {
        tree[l]!![1] = maxOf(value, tree[l]!![1])
      } else if (h != null && h == value + 1) {
        tree[value] = intArrayOf(value, tree[h]!![1])
        tree.remove(h)
      } else {
        tree[value] = intArrayOf(value, value)
      }
    }
  }

  fun getIntervals() = tree.values.toTypedArray()
}

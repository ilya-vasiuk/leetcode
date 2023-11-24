package by.ivasiuk.leetcode

import kotlin.collections.LinkedHashSet


/**
 * @see <a href="https://leetcode.com/problems/lfu-сache/">LFU Cache</a>
 */
class LFUCache(
  private val capacity: Int
) {
  private val vals = mutableMapOf<Int, Int>()
  private val counts = mutableMapOf<Int, Int>()
  private val lists = mutableMapOf<Int, LinkedHashSet<Int>>()
    .apply { put(1, LinkedHashSet()) }
  var min = -1

  fun get(key: Int): Int {
    if (!vals.containsKey(key)) {
      return -1
    }

    val count = counts[key]!!
    counts[key] = count + 1
    lists[count]!!.remove(key)
    if (count == min && lists[count]!!.isEmpty()) {
      min++
    }
    lists.putIfAbsent(count + 1, LinkedHashSet())
    lists[count + 1]!!.add(key)
    return vals[key]!!
  }

  fun put(key: Int, value: Int) {
    if (capacity <= 0) return
    if (vals.containsKey(key)) {
      vals[key] = value
      get(key)
      return
    }
    if (vals.size >= capacity) {
      val evit = lists[min]!!.iterator().next()
      lists[min]!!.remove(evit)
      vals.remove(evit)
    }
    vals[key] = value
    counts[key] = 1
    min = 1
    lists[1]!!.add(key)
  }
}

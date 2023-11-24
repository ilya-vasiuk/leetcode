package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/flatten-nested-list-iterator/">
 *   Flatten Nested List Iterator</a>
 */
class NestedIterator(nestedList: List<NestedInteger>) {
  private val flattened = nestedList.flatMap { traverse(it) }
  private val iterator = flattened.iterator()

  fun next(): Int = iterator.next()

  fun hasNext(): Boolean = iterator.hasNext()

  private fun traverse(integer: NestedInteger): List<Int> =
    if (integer.isInteger()) {
      listOf(integer.getInteger()!!)
    } else {
      integer.getList()!!.flatMap { traverse(it) }
    }
}


interface NestedInteger {
  fun isInteger(): Boolean

  fun getInteger(): Int?

  fun setInteger(value: Int)

  fun add(ni: NestedInteger)

  fun getList(): List<NestedInteger>?
}


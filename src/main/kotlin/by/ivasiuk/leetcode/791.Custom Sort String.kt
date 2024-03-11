package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/custom-sort-string/">Custom Sort String</a>
 */
class CustomSortString {
  fun customSortString(order: String, s: String): String {
    val abc = order.mapIndexed { i, c -> c to i }.toMap()

    return s.toCharArray()
      .sortedWith { a, b ->
        (abc[a] ?: Int.MAX_VALUE).compareTo(abc[b] ?: Int.MAX_VALUE)
      }.joinToString("")
  }
}

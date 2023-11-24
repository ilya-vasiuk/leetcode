package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/">
 *   Group the People Given the Group Size They Belong To</a>
 */
class GroupThePeopleGivenTheGroupSizeTheyBelongTo {
  fun groupThePeople(groupSizes: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    val groups = mutableMapOf<Int, MutableList<Int>>()

    for (i in groupSizes.indices) {
      val size = groupSizes[i]
      val group = groups.computeIfAbsent(size) { mutableListOf() }.apply { add(i) }

      if (group.size == size) {
        result.add(group)
        groups.remove(size)
      }
    }

    return result
  }
}

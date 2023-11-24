package by.ivasiuk.leetcode


/**
 * @see <a href="https://leetcode.com/problems/boats-to-save-people/">Boats to Save People</a>
 */
class BoatsToSavePeople {
  fun numRescueBoats(people: IntArray, limit: Int): Int {
    var left = 0
    var right = people.size - 1
    var boats = 0

    people.sort()

    while (left <= right) {
      if (people[left] + people[right] <= limit) {
        left++
      }

      boats++
      right--
    }

    return boats
  }
}

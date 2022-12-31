package by.ivasiuk.leetcode


/**
 * @see <a href="https://leetcode.com/problems/maximum-bags-with-full-capacity-of-rocks/">
 *   Maximum Bags With Full Capacity of Rocks</a>
 */
class MaximumBagsWithFullCapacityOfRocks {
  fun maximumBags(capacity: IntArray, rocks: IntArray, additionalRocks: Int): Int {
    val remainingSpace = IntArray(capacity.size) { i -> capacity[i] - rocks[i] }.sorted()
    var rocksLeft = additionalRocks

    var result = 0
    for (i in capacity.indices) {
      if (remainingSpace[i] == 0) {
        result++
      } else {
        if (rocksLeft >= remainingSpace[i]) {
          rocksLeft -= remainingSpace[i]
          result++
        } else {
          break
        }
      }
    }

    return result
  }
}

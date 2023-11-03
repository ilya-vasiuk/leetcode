package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/build-an-array-with-stack-operations/">
 *   Build an Array With Stack Operations</a>
 */
class BuildAnArrayWithStackOperations {
  fun buildArray(target: IntArray, n: Int): List<String> {
    val result = mutableListOf<String>()
    var i = 1
    var j = 0

    while (j < target.size) {
      result.add("Push")

      if (target[j] != i) {
        result.add("Pop")
      } else {
        j++
      }

      i++
    }

    return result
  }
}

package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/destination-city/">Destination City</a>
 */
class DestinationCity {
  fun destCity(paths: List<List<String>>): String =
    with(mutableMapOf<String, Int>()) {
      paths.forEach { (from, to) ->
        merge(from, 1) { old, new -> old + new }
        putIfAbsent(to, 0)
      }

      entries.first { it.value == 0 }.key
    }
}

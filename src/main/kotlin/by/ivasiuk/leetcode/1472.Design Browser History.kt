package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/design-browser-history/">
 *   Design Browser History</a>
 */
class BrowserHistory(homepage: String) {
  var current = Entry(homepage)

  fun visit(url: String) {
    Entry(url, previous = current).also {
      current.next = it
      current = it
    }
  }

  fun back(steps: Int): String {
    repeat(steps) { current = current.previous ?: return@repeat }

    return current.url
  }

  fun forward(steps: Int): String {
    repeat(steps) { current = current.next ?: return@repeat }

    return current.url
  }

  data class Entry(
    val url: String,
    var previous: Entry? = null,
    var next: Entry? = null,
  )
}

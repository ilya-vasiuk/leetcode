package by.ivasiuk.leetcode

import java.util.Stack

/**
 * @see <a href="https://leetcode.com/problems/simplify-path/">Simplify Path</a>
 */
class SimplifyPath {
  fun simplifyPath(path: String): String =
    Stack<String>().apply {
      split@ for (part in path.split("/")) {
        when (part) {
          "", "." -> continue@split
          ".." -> if (isNotEmpty()) pop()
          else -> push(part)
        }
      }
    }.joinToString("/", "/")
}

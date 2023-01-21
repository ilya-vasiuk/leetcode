package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/restore-ip-addresses/">
 *   Restore IP Addresses</a>
 */
class RestoreIPAddresses {
  fun restoreIpAddresses(s: String): List<String> {
    val ipAddresses = mutableListOf<String>()

    backtrack(s, listOf(), ipAddresses)

    return ipAddresses
  }

  private fun isValid(segment: String) =
    segment.toInt() in 0..255 && (segment.length == 1 || segment[0] != '0')

  private fun backtrack(segment: String, ips: List<String>, ipAddresses: MutableList<String>) {
    if (segment.isEmpty()) {
      if (ips.size == 4) {
        ipAddresses.add(ips.joinToString("."))
      }
      return
    }

    for (i in 1..3) {
      if (i <= segment.length) {
        val newSegment = segment.substring(0, i)

        if (isValid(newSegment)) {
          backtrack(segment.substring(i), ips + newSegment, ipAddresses)
        }
      }
    }
  }
}

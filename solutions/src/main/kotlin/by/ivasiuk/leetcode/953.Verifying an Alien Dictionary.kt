package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/two-sum/">
 *   Verifying an Alien Dictionary</a>
 */
class VerifyingAnAlienDictionary {
  fun isAlienSorted(words: Array<String>, order: String): Boolean {
    if (words.size == 1) {
      return true
    }

    val comparator = AlienComparator(order)

    return (0 until words.size - 1).all {
      comparator.compare(words[it], words[it + 1]) >= 0
    }
  }

  class AlienComparator(order: String) : Comparator<String> {
    private val alphabet = mutableMapOf<Char, Int>()

    init {
      for (i in order.indices) alphabet[order[i]] = i
    }

    override fun compare(word1: String, word2: String): Int {
      for (i in 0 until minOf(word1.length, word2.length)) {
        when (alphabet[word2[i]]!!.compareTo(alphabet[word1[i]]!!)) {
          -1 -> return -1
          1 -> return 1
        }
      }

      return word2.length - word1.length
    }
  }
}

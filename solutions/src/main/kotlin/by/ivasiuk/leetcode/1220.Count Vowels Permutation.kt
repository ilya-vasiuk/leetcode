package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/count-vowels-permutation/">Count Vowels Permutation</a>
 */
class CountVowelsPermutation {
  fun countVowelPermutation(n: Int): Int {
    val options = mapOf(
      'a' to arrayOf('e'),
      'e' to arrayOf('a', 'i'),
      'i' to arrayOf('a', 'e', 'o', 'u'),
      'o' to arrayOf('i', 'u'),
      'u' to arrayOf('a'),
      '.' to arrayOf('a', 'e', 'i', 'o', 'u')
    )

    val permutations = mutableMapOf<Pair<Int, Char>, Long>()

    fun check(i: Int, c: Char): Long {
      if (i == n) {
        return 1L
      }

      return permutations.getOrPut(i to c) { options[c]!!.sumOf { check(i + 1, it) } } % MODULO
    }

    return check(0, '.').toInt()
  }

  companion object {
    const val MODULO = 1_000_000_007
  }
}

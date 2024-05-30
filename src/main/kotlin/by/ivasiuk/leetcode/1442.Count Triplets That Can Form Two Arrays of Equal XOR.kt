package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/">
 *   Count Triplets That Can Form Two Arrays of Equal XOR</a>
 */
class CountTripletsThatCanFormTwoArraysOfEqualXOR {
  fun countTriplets(arr: IntArray): Int {
    val n = arr.size
    var count = 0
    val prefixXOR = IntArray(n + 1).also {
      for (i in 0 until n) {
        it[i + 1] = it[i] xor arr[i]
      }
    }

    for (i in 0 until n) {
      for (j in i + 1 until n) {
        for (k in j until n) {
          if ((prefixXOR[j] xor prefixXOR[i]) == (prefixXOR[k + 1] xor prefixXOR[j])) {
            ++count
          }
        }
      }
    }

    return count
  }
}

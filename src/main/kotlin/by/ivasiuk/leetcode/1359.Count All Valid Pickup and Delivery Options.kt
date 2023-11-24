package by.ivasiuk.leetcode

/**
 * @see <a href="https://leetcode.com/problems/count-all-valid-pickup-and-delivery-options/">
 *   Count All Valid Pickup and Delivery Options</a>
 */
class CountAllValidPickupAndDeliveryOptions {
  fun countOrders(n: Int): Int =
    (1..n)
      .fold(1L) { acc, i -> (2 * i * i * acc - acc * i) % MODULO }
      .toInt()

  companion object {
    const val MODULO = 1_000_000_007
  }
}

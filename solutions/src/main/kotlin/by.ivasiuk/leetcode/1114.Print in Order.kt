package by.ivasiuk.leetcode

import java.util.concurrent.CountDownLatch

/**
 * @see <a href="https://leetcode.com/problems/print-in-order/">
 *   Print in Order</a>
 */
class PrintInOrder {
  private var firstRan = CountDownLatch(1)
  private var secondRan = CountDownLatch(1)

  @Throws(InterruptedException::class)
  fun first(printFirst: Runnable) {
    // printFirst.run() outputs "first". Do not change or remove this line.
    printFirst.run()
    firstRan.countDown()
  }

  @Throws(InterruptedException::class)
  fun second(printSecond: Runnable) {
    firstRan.await()
    // printSecond.run() outputs "second". Do not change or remove this line.
    printSecond.run()
    secondRan.countDown()
  }

  @Throws(InterruptedException::class)
  fun third(printThird: Runnable) {
    secondRan.await()
    // printThird.run() outputs "third". Do not change or remove this line.
    printThird.run()
  }
}
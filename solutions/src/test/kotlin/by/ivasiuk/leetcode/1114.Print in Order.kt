package by.ivasiuk.leetcode

import kotlin.test.Ignore
import kotlin.test.Test
import kotlin.test.assertContentEquals

class PrintInOrderTest {
  private val solution = PrintInOrder()

  @Ignore
  @Test
  fun example1() {
    val sout = mutableSetOf<String>()

    Thread { solution.third { sout.add("third") } }.start()
    Thread { solution.second { sout.add("second") } }.start()
    Thread { solution.first { sout.add("first") } }.start()

    assertContentEquals(listOf("first", "second", "third"), sout)
  }
}
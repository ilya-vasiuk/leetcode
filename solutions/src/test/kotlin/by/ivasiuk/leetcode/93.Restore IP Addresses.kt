package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertContentEquals

class RestoreIPAddressesTest {
  private val solution = RestoreIPAddresses()

  @Test
  fun example1() {
    assertContentEquals(
      expected = listOf("255.255.11.135", "255.255.111.35"),
      actual = solution.restoreIpAddresses(
        s = "25525511135"
      )
    )
  }

  @Test
  fun example2() {
    assertContentEquals(
      expected = listOf("0.0.0.0"),
      actual = solution.restoreIpAddresses(
        s = "0000"
      )
    )
  }

  @Test
  fun example3() {
    assertContentEquals(
      expected = listOf("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3"),
      actual = solution.restoreIpAddresses(
        s = "101023"
      )
    )
  }
}

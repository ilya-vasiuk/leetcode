package by.ivasiuk.leetcode

import kotlin.math.sqrt

/**
 * @see <a href="https://leetcode.com/problems/bulb-switcher/">Bulb Switcher</a>
 */
class BulbSwitcher {
  fun bulbSwitch(n: Int) = sqrt(n.toDouble()).toInt()
}

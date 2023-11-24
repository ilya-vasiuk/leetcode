package by.ivasiuk.leetcode

import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/snapshot-array/">
 *   Snapshot Array</a>
 */
class SnapshotArray(length: Int) {
  private val values = Array(length) { TreeMap<Int, Int>() }
  private var version = 0

  fun set(index: Int, `val`: Int) {
    values[index][version] = `val`
  }

  fun snap() = version++

  fun get(index: Int, snap_id: Int) =
    values[index].floorEntry(snap_id)?.value ?: 0
}

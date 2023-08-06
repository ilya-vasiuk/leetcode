package by.ivasiuk.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class NumberOfMusicPlaylistsTest {
  private val solution = NumberOfMusicPlaylists()

  @Test
  fun example1() {
    assertEquals(
      expected = 6,
      actual = solution.numMusicPlaylists(
        n = 3,
        goal = 3,
        k = 1
      )
    )
  }

  @Test
  fun example2() {
    assertEquals(
      expected = 6,
      actual = solution.numMusicPlaylists(
        n = 2,
        goal = 3,
        k = 0
      )
    )
  }

  @Test
  fun example3() {
    assertEquals(
      expected = 2,
      actual = solution.numMusicPlaylists(
        n = 2,
        goal = 3,
        k = 1
      )
    )
  }
}

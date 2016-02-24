package lists

import org.scalatest.FlatSpec

import lists.P03.nth

class ListNthSpec extends FlatSpec {
  "Checking for 0th element on List(1, 2, 3, 4, 5)" should "yield 1" in {
    val list = List(1, 2, 3, 4, 5)

    assert(nth(0, list) == 1)
  }

  "Checking for 1st element on List(42)" should "yield NoSuchElementException" in {
    val list = List(42)

    intercept[NoSuchElementException] {
      nth(1, list)
    }
  }
}

package lists

import org.scalatest.FlatSpec

import lists.P01.last

class ListLastSpec extends FlatSpec {
  "Checking for the last element of List(1, 2, 3, 4, 5)" should "yield 5" in {
    val list = List(1, 2, 3, 4, 5)
    assert(last(list) == 5)

  }

  "Checking for the last element of List(42)" should "yield 42" in {
    val list = List(42)
    assert(last(list) == 42)
  }

  "Checking for the last element of List()" should "yield NoSuchElementException" in {
    val list = List()

    val exception = intercept[NoSuchElementException]{
      last(list)
    }

    assert(exception.getMessage == "Empty list does not have a last element.")
  }
}

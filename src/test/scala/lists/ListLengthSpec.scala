package lists

import org.scalatest.FlatSpec

import lists.P04.length

class ListLengthSpec extends FlatSpec{

  "The length of an empty list" should "be 0" in {

    val list = List()

    assert(length(list) == 0)
  }

  "The length of List(1, 2, 3, 4, 5)" should "be 5" in {
    val list = List(1, 2, 3, 4, 5)

    assert(length(list) == 5)
  }
}

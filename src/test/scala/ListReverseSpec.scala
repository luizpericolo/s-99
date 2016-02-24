package lists

import org.scalatest.FlatSpec

import lists.P05.reverse

class ListReverseSpec extends FlatSpec {

  "Reverse of List(1, 2, 3)" should "be List(3, 2, 1)" in {
    val list = List(1, 2, 3)

    assert(reverse(list) == List(3, 2, 1))

  }

}

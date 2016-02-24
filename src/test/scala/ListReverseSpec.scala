package lists

import org.scalatest.FlatSpec

import lists.P05.reverse

class ListReverseSpec extends FlatSpec {

  "Reverse of List(1, 2, 3)" should "be List(3, 2, 1)" in {
    val list = List(1, 2, 3)

    assert(reverse(list) == List(3, 2, 1))

  }

  "Reverse of List(42)" should "be List(42)" in {

    assert(reverse(List(42)) == List(42))

  }

  "Reverse of List()" should "be List()" in {

    assert(reverse(List()) == List())
  }

}

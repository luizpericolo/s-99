package lists

import org.scalatest.FlatSpec

import lists.P02.penultimate

class ListPenultimateSpec extends FlatSpec {

  "Checking for the penultimate element of List(1, 2, 3, 4, 5)" should "yield 4" in {
    val list = List(1, 2, 3, 4, 5)

    assert(penultimate(list) == 4)
  }

  "Checking for the penultimate element of List(42)" should "yield NoSuchElementException" in {
    val list = List(42)

    val exception = intercept[NoSuchElementException] {
      penultimate(list)
    }

    assert(exception.getMessage == "A list with less than two elements does not have a penultimate element.")
  }


  "Checking for the penultimate element of List()" should "yield NoSuchElementException" in {
    val list = List()

    val exception = intercept[NoSuchElementException] {
      penultimate(list)
    }

    assert(exception.getMessage == "A list with less than two elements does not have a penultimate element.")
  }
}

package lists

/*
  Find the last element of a list.
  Example:
  scala> last(List(1, 1, 2, 3, 5, 8))
  res0: Int = 8
*/

object P01 {

  def last[A](list: List[A]): A = {
    list match {
      case h :: Nil => h
      case _ :: tail => last(tail)
      case _  => throw new NoSuchElementException("Empty list does not have a last element.")
    }
  }
}

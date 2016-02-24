package lists

import java.security.InvalidParameterException

/*
  Reverse a list.
  Example:
    scala> reverse(List(1, 1, 2, 3, 5, 8))
    res0: List[Int] = List(8, 5, 3, 2, 1, 1)
*/

object P05 {

    def reverse[A](list: List[A]): List[A] = {
      list match {
        case h :: tail => reverse(tail) ++ List(h)
        case Nil => List()
      }
    }
}

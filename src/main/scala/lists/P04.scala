package lists

import java.security.InvalidParameterException

/*
  Find the number of elements of a list.
  Example:
    scala> length(List(1, 1, 2, 3, 5, 8))
    res0: Int = 6
*/

object P04 {

    def length[A](list: List[A]): Int = {

      def recursiveLength[A](length: Int, list: List[A]): Int = {
        list match {
          case _ :: tail => recursiveLength(length + 1, tail)
          case Nil => length
          case _ => throw new InvalidParameterException
        }
      }

      recursiveLength(0, list)
    }
}

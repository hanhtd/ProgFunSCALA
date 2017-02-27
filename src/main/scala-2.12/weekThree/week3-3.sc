import weekThree.List

import scala.annotation.tailrec

@tailrec
def nth[T](index: Int,  list: List[T]):T = {
  assert(index > 0, "index must be zero or greater than zero")
  if(list.isEmpty) throw new IndexOutOfBoundsException("index = " + index + " is outside the range")
  else if (index == 0) list.head else nth(index - 1 ,list.tail)
}
import weekThree._

import scala.annotation.tailrec

@tailrec
def nth[T](index: Int,  list: List[T]):T = {
  assert(index >= 0, "index must be zero or greater than zero")
  if(list.isEmpty) throw new IndexOutOfBoundsException
  else if (index == 0) list.head else nth(index - 1 ,list.tail)
}


val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))

nth(4, list)
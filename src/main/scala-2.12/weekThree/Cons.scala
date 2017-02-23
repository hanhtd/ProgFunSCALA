package weekThree

/**
  * Created by htruongduc on 2/23/2017.
  */
trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}
//TODO: why use val at class variables to automatic create method
class Cons[T](val head: T,val tail: List[T]) extends List[T]{
  def isEmpty: Boolean = false
/*
  def head: T = _head

  def tail: List[T] = _tail*/
}

class Nil[T] extends List[T] {
  def isEmpty: Boolean = true

  def head: T = throw new NoSuchElementException("Nil.head")

  def tail: List[T] = throw new NoSuchElementException("Nil.tail")
}

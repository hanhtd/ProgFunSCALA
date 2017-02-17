package weekThree

/**
  * Created by htruongduc on 2/15/2017.
  */
//TODO: 1. Read + practice recursive algorithm with data-structure & algorithm course and discrete math
//TODO: 2. How to thinking in functional
//TODO: 3. Review to find out how to read + practice in week 1 && week 2
//TODO: 4. Recursive ending??
class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def incl(x: Int): IntSet = if (x < elem) new NonEmpty(elem, left incl x, right) else if (x > elem) new NonEmpty(elem, left, right incl x) else this

  def contains(x: Int): Boolean = if (x < elem) left contains x else if (x > elem) right contains x else true

  override def toString = "{" + left + elem + right + "}"

  def union(other: IntSet): IntSet = {
    println("(" + "(" + left + " UN " + right + ")" + " UN " + other + ")" + " INCL " + elem)
    ((left union right) union other) incl elem
  }
}

object NonEmpty {
  def apply(elem : Int, left: Int, right: Int) = new NonEmpty(elem, new NonEmpty(left, Empty, Empty), new NonEmpty(right, Empty, Empty))

  def apply(elem : Int, left: IntSet, right: IntSet) = new NonEmpty(elem, left, right)
}

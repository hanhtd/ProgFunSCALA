package weekThree

/**
  * Created by htruongduc on 2/15/2017.
  */
//TODO: 1. Read + practice recursive algorithm with datastructure&algorithm course and discrete math
//TODO: 2. How to thinking in functional
//TODO: 3. Review to find out how to read + practice in week 1 && week 2
class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def incl(x: Int): IntSet = if (x < elem) new NonEmpty(elem, left incl x, right) else if (x > elem) new NonEmpty(elem, left, right incl x) else this

  def contains(x: Int): Boolean = if (x < elem) left contains x else if (x > elem) right contains x else true

  override def toString = "{" + left + elem + right + "}"

  def union(other: IntSet): IntSet = ((left union right) union other) incl elem
}

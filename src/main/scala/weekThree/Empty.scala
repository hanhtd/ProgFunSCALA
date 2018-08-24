package weekThree

/**
  * Created by htruongduc on 2/15/2017.
  */
object Empty extends IntSet{
  def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)

  def contains(x: Int): Boolean = false

  override def toString = "."

  def union(other: IntSet): IntSet = other
}

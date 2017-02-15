package weekThree

/**
  * Created by htruongduc on 2/15/2017.
  */
abstract class IntSet {
  def incl(x: Int): IntSet

  def contains(x: Int): Boolean

  def union(other: IntSet): IntSet
}

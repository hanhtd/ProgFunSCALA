package weekThree

/**
  * Created by htruongduc on 2/15/2017.
  */
object HelloWorld {
  def main(args: Array[String]) = {
    val t1  = NonEmpty(7, NonEmpty(5, 3, 4), NonEmpty(9, NonEmpty(16, Empty, Empty), NonEmpty(18, 17, 20)))
    println("t1 = " + t1)
    val t2= NonEmpty(9, NonEmpty(7, 5, 8), NonEmpty(8, Empty, NonEmpty(10, Empty, Empty)))
    println("t2 = " + t2)
    println(" t1 union t2 " + (t1 union t2))
    println(" t2 union t1 " + (t2 union t1))
    println("Hello Scala 12")}
}

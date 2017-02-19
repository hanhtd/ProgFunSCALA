package weekThree

/**
  * Created by truongduchanh on 2/18/17.
  */
class Carrot {
  val helloTen = { println ("hello ten" ); 10 }
  var helloScala = { println("hello Scala Var" ); 9 }
  def helloJavaDef = { println("hello java def"); 8 }
  def helloJavaDefParenthess() = { println("hello helloJavaDefParenthess"); 12 }
}

class Soybean extends Carrot {
  override val helloTen: Int = 24

  //override var helloScala = 25 //Cannot override var attribute from supper class
  override def helloJavaDef(): Int = 25
  override val helloJavaDefParenthess = 26

}

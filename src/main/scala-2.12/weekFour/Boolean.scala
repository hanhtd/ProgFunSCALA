package weekFour

/**
  * Created by htruongduc on 6/22/2017.
  */
abstract class Boolean {
  def ifThenElse[T](t: => T, e: => T): T
  def && (x: => Boolean): Boolean = ifThenElse[Boolean](x, falseValue)
  def || (x: => Boolean): Boolean = ifThenElse[Boolean](trueValue, x)
  def unary_! : Boolean = ifThenElse[Boolean](falseValue, trueValue)
  def == (x: Boolean) : Boolean =  ifThenElse[Boolean](x, x.unary_!)
  def != (x: Boolean) : Boolean =  ifThenElse[Boolean](x.unary_!, x)
  //def < (x: Boolean): Boolean = this.!=(x).&&(trueValue.==(x))
  def < (x: Boolean): Boolean = ifThenElse(falseValue, x)
}

object trueValue extends Boolean {
  def ifThenElse[T](t: => T, e: => T) = t
}

object falseValue extends Boolean {
  def ifThenElse[T](t: => T, e: => T) = e
}

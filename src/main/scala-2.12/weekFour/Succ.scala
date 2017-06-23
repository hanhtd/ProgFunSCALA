package weekFour

/**
  * Created by htruongduc on 6/22/2017.
  */
abstract class Nat {
  def isZero(): Boolean
  def predecessor: Nat
  def successor: Nat
  def + (that: Nat): Nat
  def - (that: Nat): Nat
  def  toInt: Int = {
    var i = 0
    var temp: Nat = this
    while(!temp.isZero().toScalaBoolean()) {
      temp = temp.predecessor
      i = i + 1
    }
    i
  }
}

class Succ(n: Nat) extends Nat{
  def isZero(): Boolean = falseValue

  def predecessor: Nat = n

  def successor: Nat = new Succ(this)

  def +(that: Nat): Nat = that.isZero().ifThenElse(this, this.successor.+(that.predecessor))

  def -(that: Nat): Nat = that.isZero().ifThenElse(this, this.predecessor.-(that.predecessor))
}

object Zero extends Nat {
  def isZero(): Boolean = trueValue

  def predecessor: Nat = throw new NoSuchElementException("Zero.predecessor")

  def successor: Nat = new Succ(Zero)

  //TODO: thinking later about mutable data affection
  def +(that: Nat): Nat = that

  def -(that: Nat): Nat = that.isZero().ifThenElse(Zero, throw new NoSuchElementException("Zero.predecessor"))
}
//TODO: [Question] How to debug scala programm in InteliJ

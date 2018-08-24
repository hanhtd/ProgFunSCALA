package weekFour

/**
  * Created by htruongduc on 6/22/2017.
  */
abstract class Nat {
  def isZero(): Boolean

  def predecessor: Nat

  def successor: Nat = new Succ(this)

  def +(that: Nat): Nat

  def -(that: Nat): Nat

  //for testing only
  def toInt: Int = {
    var i = 0
    var temp: Nat = this
    while (!temp.isZero().toScalaBoolean()) {
      temp = temp.predecessor
      i = i + 1
    }
    i
  }
}

class Succ(n: Nat) extends Nat {
  def isZero(): Boolean = falseValue

  def predecessor: Nat = n

  def +(that: Nat): Nat = new Succ(n + that)

  def -(that: Nat): Nat = that.isZero().ifThenElse(this, n - that.predecessor)
}

object Zero extends Nat {
  def isZero(): Boolean = trueValue

  def predecessor: Nat = throw new Error("Zero.predecessor")

  def +(that: Nat): Nat = that

  def -(that: Nat): Nat = that.isZero().ifThenElse(Zero, throw new Error("Zero.predecessor"))
}

//TODO[LTS]: [Question] How to debug scala programm in InteliJ
//TODO[LTS]: practice algorithm with recursion
//TODO[LTS]: read + practice functional thinking with Nearl Forth

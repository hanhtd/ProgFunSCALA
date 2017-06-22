package weekFour

/**
  * Created by htruongduc on 6/22/2017.
  */
abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat
  def + (that: Nat): Nat
  def - (that: Nat): Nat
}

class Succ(n: Nat) extends Nat{

}

object Zero extends Nat {

}

package weekTwo

import scala.annotation.tailrec

/**
  * Created by htruongduc on 2/13/2017.
  */
//TODO: 1. Reading about substution mode in scala
//TODO: 2. Other evaluate mode in compiler: SCIP book
//TODO: [OK]3. What is identifier in scala and relaxed identifier?
//The names of variables, classes, objects and methods are collectively called Identifiers
class EnhanceOptimalRational(x: Int, y: Int) {
  require(y > 0, "denominator must be positive")

  def this(x: Int) = this(x, 1)

  @tailrec
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  val numer = x / gcd(x, y)

  val denom = y / gcd(x, y)

  def + (that: EnhanceOptimalRational) = new EnhanceOptimalRational(this.numer * that.denom + that.numer * this.denom, this.denom * that.denom)

  def - (that: EnhanceOptimalRational) = this + (-that)

  def * (that: EnhanceOptimalRational) = new EnhanceOptimalRational(x * that.numer, y * that.denom)

  def unary_- = new EnhanceOptimalRational(-numer, denom)

  def < (that: EnhanceOptimalRational) = this.numer * that.denom < that.numer * this.denom

  def max (that: EnhanceOptimalRational) = if (this < that) that else this

  override def equals(obj: scala.Any): Boolean = if (obj != null && obj.isInstanceOf[EnhanceOptimalRational]) {
    val objRational = obj.asInstanceOf[EnhanceOptimalRational]
    this.numer * objRational.denom == this.denom * objRational.numer
  } else false

  override def toString: String = numer + "/" + denom
}
package weekTwo

import scala.annotation.tailrec

/**
  * Created by htruongduc on 2/8/2017.
  */
class OptimalRational(x: Int, y: Int) {
  require(y > 0, "denominator must be positive")

  def this(x: Int) = this(x, 1)

  @tailrec
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  val numer = x / gcd(x, y)

  val denom = y / gcd(x, y)

  def add(that: OptimalRational) = new OptimalRational(this.numer * that.denom + that.numer * this.denom, this.denom * that.denom)

  def sub(that: OptimalRational) = add(that.neg)

  def mul(that: OptimalRational) = new OptimalRational(x * that.numer, y * that.denom)

  def neg() = new OptimalRational(-numer, denom)

  def less (that: OptimalRational) = this.numer * that.denom < that.numer * this.denom

  def max (that: OptimalRational) = if (this.less(that)) that else this

  override def equals(obj: scala.Any): Boolean = if (obj != null && obj.isInstanceOf[OptimalRational]) {
    val objRational = obj.asInstanceOf[OptimalRational]
    this.numer * objRational.denom == this.denom * objRational.numer
  } else false

  override def toString: String = numer + "/" + denom
}
package weekTwo

/**
  * Created by htruongduc on 2/6/2017.
  */
class Rational(x: Int, y: Int) {
  //Q_1: Why we use def at here instead of val or var
  def numer = x

  def denom = y

  def add(that: Rational) = new Rational(this.numer * that.denom + that.numer * this.denom, this.denom * that.denom)

  //new Rational(this.numer * that.denom - that.numer * this.denom, this.denom * that.denom)
  def sub(that: Rational) = add(that.neg)


  def mul(that: Rational) = new Rational(x * that.numer, y * that.denom)

  def neg() = new Rational(-numer, denom)

  //Q_2: what is difference between equals and == in scala
  //AS: eq for compare reference to same obj; equals for compare value of 2 objects (default implementation = equal method)
  //== null-safe of equals
  override def equals(obj: scala.Any): Boolean = if (obj != null && obj.isInstanceOf[Rational]) {
    val objRational = obj.asInstanceOf[Rational]
    this.numer * objRational.denom == this.denom * objRational.numer
  } else false

  override def toString: String = numer + "/" + denom
}

//Q_3: what is difference between function and method in scala
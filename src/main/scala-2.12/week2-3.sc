import scala.annotation.tailrec
import scala.math._;
val tolerance = 0.0001
def isCloseEnough(x: Double, y: Double) = abs((x - y) / x) / x < tolerance
def fixedPoint(f: Double => Double)(firstGuess: Double) = {
  println("before declaration")
  @tailrec
  def iterate(guess: Double): Double = {
    val next  = f(guess)
    println(next)
    if (isCloseEnough(guess, next)) next
    else iterate(next)
  }
  println("after declaration")
  println("before call")
  iterate(firstGuess)
}

//def sqrt_new(x:Double) = fixedPoint(y => x / y)(1.0)
def sqrt_new(x:Double) = fixedPoint(y => (y + x/y) / 2)(1.0)
//sqrt_new(2)
//val thutt = sqrt_new(2)
//def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2


//def sqrt_new_new(x:Double) = fixedPoint((y => x / y))(1.0)
//sqrt_new_new(2)

//println("hanhtd xxx = " + hanhtd)
def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2
def sqrt_new_new(x: Double) = fixedPoint(averageDamp(y => x / y))(1)
sqrt_new_new(2)


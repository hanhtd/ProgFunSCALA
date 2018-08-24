import misc.Account

/*import scala.math._
val num = 3.14
val fun = ceil _
ceil(num)
fun(num)
Array(3.14, 1.42, 2.0).map(fun)

/*def triple(x: Double) = 3 * x
(x: Double) => 3 * x
val triple = (x: Double) => 3 * x
Array(3.14, 1.42, 2.0) map {(x: Double) => 3 * x}*/

def valueAtOneQuater(f: (Double) => Double) = f(0.25)
valueAtOneQuater(ceil _);

val fun1 = 3 * (_: Double)
val fun2: (Double) => Double = 3 * _
(1 to 9).map(0.1 * _)
(1 to 9).map("*" * _).foreach(println _)
(1 to 9).filter({_ % 2 ==0})
(1 to 9).reduceLeft(_ * _)

"Mary had a little lamb".split(" ").sortWith(_.length < _.length)
"Mary had a little lamb".split(" ").sortWith((x, y) => {x.length < y.length})

def mulBy(factor : Double) = (x : Double) => factor * x
val triple = mulBy(3)
val half = mulBy(0.5)
println(triple(14) + " " + half(14)) // Prints 42 7
//
//def until(condition: => Boolean)(block: => Unit)  {
//    if (!condition) {
//        block
//        until(condition)(block)
//      }
//}
*/
def until(condition: => Boolean)(block: => Unit) {
  if(!condition) {
    block
    until(condition)(block)
  }
}
var x = 10
until(x == 0) ({
  x -= 1
  println(x)
})
/*
until(x == 0, {
  x -= 1
  println(x)
})*/

def indexOf(str: String, ch: Char): Int = {
  var i =0
  until(i == str.length) {
    if(str(i) == ch) return i
    i += 1
  }
  println("before return -1")
  return -1
}

def wrapperFun():Unit = {
  val position = indexOf("Hanhtd kaka in the worlderlan", 'k')
  println("come here")
  println("position = " + position)
}

//println("index of value = " + indexOf("Hanhtd kaka in the worlderlan", 'k'))
wrapperFun()
3 == BigInt(3)
BigInt(3) == 3
3.equals(BigInt(3))
BigInt(3).equals(3)
println("============= Example of String equality ===============")
val s1 = "Hello"
val s2 = "Hello"
val s3 = "H" + "ello"
s1 == s2
s2 == s3
val s4: String = null
s3 == s4
s1.##
null == 43
val acct = Account(1000.0)

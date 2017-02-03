import scala.annotation.tailrec

def sum(f: Int => Int, a: Int, b: Int): Int = if(a > b) 0 else f(a) + sum(f, a + 1, b)
def id(x: Int): Int = x
def cube(x: Int): Int = x * x * x
def factorial_tail_rec(n: Int): Int =  {
  @tailrec
  def loop(acc: Int, n: Int):Int =
    if (n == 0) acc else loop(acc * n, n -1)
  loop(1, n)
}
def sumInts(a: Int, b : Int) = sum(id, a, b)
def sumCubes(a: Int, b : Int) = sum(cube, a, b)
def sumFactorial(a: Int, b : Int) = sum(factorial_tail_rec, a, b)

sumInts(1, 7)
sumCubes(1, 7)
sumFactorial(1, 7)


def sum_tail_rec(f: Int => Int)(a: Int, b: Int): Int = {
  @tailrec
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a + 1, acc + f(a))
  }
  loop(a, 0)
}

sum_tail_rec(id)(1, 100000);
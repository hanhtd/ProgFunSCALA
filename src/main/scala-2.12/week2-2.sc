
product(x => x * x)(3, 7)

//def factorial(n: Int): Int =  if (n == 0) 1 else n * factorial(n - 1)
def fact(n: Int): Int = product(x => x)(1, n)
fact(5)
def product(f: Int => Int)(a: Int, b: Int): Int =  if (a > b) 1 else f(a) * product(f)(a + 1, b)

def sum(f: Int => Int)(a: Int, b: Int): Int = if(a > b) 0 else f(a) + sum(f)(a + 1, b)

def generalizer_fun(cal: (Int, Int) => Int)(f: Int => Int)(a: Int, b: Int): Int =
  if (a > b) 1 else cal(f(a), generalizer_fun(cal)(f)(a + 1, b))

def product_new(f: Int => Int)(a: Int, b: Int) = generalizer_fun((x, y) => x * y)(f)(a, b)

product_new(x => x)(8, 13)
product(x => x)(8, 13)


def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
if (a > b) zero else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
def mapReduce_1(f: Int => Int)(combine: (Int, Int) => Int)(zero: Int)(a: Int, b: Int): Int =
  if (a > b) zero else combine(f(a), mapReduce_1(f)(combine)(zero)(a + 1, b))


def sumxx(f: Int => Int, a: Int, b: Int): Int = if (a > b) 0 else f(a) + sumxx(f, a + 1, b)
def sumInts(a: Int, b: Int) = sumxx(x => x, 1, 2)
def sumCubes(a: Int, b: Int) = 11
sumCubes(12, 12)
sumCubes(17, 18)

val a = 10
val b = 12
val c = sumxx(x => x, a, b)
def sumIntsxx(a: Int, b: Int) = sumxx(x => x, 1, 2)
def sumIntsxxyy(a: Int, b: Int) = sumxx(x => x, a, b)
//Answer question later.
//Question_1:
//tai sao khi truyen a, b la value thi evaluate luon call by value
//  con khi truyen a, b la parameter thi la call by name

//Question_2:
//Function type reduce ???

//Question_3:
//For functional programming model, cai gi la cai thuc su o phia duoi de thay the may turing
//de thay the call stack, stack frame, etc ????

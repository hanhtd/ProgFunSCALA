import weekTwo.Rational

val x = new Rational(1, 2)
x.numer
x.denom

def addRational(r: Rational, s: Rational): Rational = new Rational(r.numer * s.denom + s.numer * r.denom, s.denom * r.denom)
def makeString(r: Rational) = r.numer + "/" + r.denom

makeString(addRational(new Rational(1, 2), new Rational(2, 3)))

val y = new Rational(4, 5)
val z = new Rational(4, 8)
x add y

x == y
x == z
z.neg

val a = new Rational(1, 3)
val b = new Rational(5, 7)
val c = new Rational(3, 2)

a sub b sub c
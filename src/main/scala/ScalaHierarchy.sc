def isEqual1(x: Int, y: Int) = x == y
def isEqual2(x: Any, y: Any) = x == y
isEqual1(421, 421)
isEqual2(421, 421)

val x = new String("abc")
val y = new String("abc")
x == y
x eq y
x ne y

import java.util

def loop: Boolean = loop

def and(x: Boolean, y: => Boolean) = if(x) y else false;
def or(x: Boolean, y: Boolean) = if(x) true else y
and(true, true)
and(false, false)
and(false, true)
and(true, false)
//and(true, loop)
and(false, loop)

def hello(name: String):String = "Hello " + name
def x: String = hello("hanh")
println("This is scala world! " + x)


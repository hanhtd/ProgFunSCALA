import weekThree.{Carrot, Soybean}

val c = new Soybean
c.helloTen
c.helloScala
c.helloJavaDef
c.helloJavaDefParenthess


val d = new Soybean
val e = d.asInstanceOf[Carrot]
// now allow e.helloJavaDef()
e.helloJavaDef
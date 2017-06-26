import weekFour.{Succ, Zero}

var number2 = new Succ(Zero).successor
var number5 = new Succ(Zero).successor.successor.successor.successor

var result7 = number5.+(number2)
result7.toInt
var result3 = number5.-(number2)
result3.toInt
var result0 = number5.-(number5)
result0.toInt
var resultNegative3 = number2.-(number5)
resultNegative3.toInt
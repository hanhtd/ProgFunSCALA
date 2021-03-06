package weekFour

/**
  * Created by htruongduc on 7/18/2017.
  */
trait Logger {
  def log(msg: String);
}

trait ConsoleLogger extends Logger {
  def log(msg: String) { println(msg) }
}

trait TimestampLogger extends Logger {
  abstract override def log(msg: String) {
    println(">>> go to TimestampLogger")
    super/*[ConsoleLogger]*/.log(new java.util.Date() + " " + msg)
  }
}

trait ShortLogger extends Logger {
  abstract override def log(msg: String) {
    println("**** go to ShotLogger")
    super/*[ConsoleLogger]*/.log(
      if (msg.length <= 15) msg else s"${msg.substring(0, 12)}...")
  }
}

class Account {
  protected var balance = 0.0
}

abstract class SavingsAccount extends Account with Logger {
  def withdraw(amount: Double) {
    if (amount > balance) log("Insufficient funds")
    else balance -= amount
  }

  // More methods ...
}

object Main extends App {
  val acct1 = new SavingsAccount with ConsoleLogger with TimestampLogger with ShortLogger
  val acct2 = new SavingsAccount with ConsoleLogger with ShortLogger with TimestampLogger
  acct1.withdraw(100)
  acct2.withdraw(100)
}


package misc

/**
  * Created by htruongduc on 6/21/2017.
  */
class Account(val id:Int, initialBalance: Double) {
  private var balance = initialBalance

  def deposit(amount: Double) {
    balance += amount
  }

}

object Account {
  private var lastNumber = 0;

  private def newUniqueNumber() = {
    lastNumber += 1; lastNumber
  }
  def apply(initialBalance: Double) = new Account(newUniqueNumber(), initialBalance)
}

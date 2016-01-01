package tr.aalci.beyondjava

class Customer (name: String, address: String)

object Customer {
  def apply(name: String, address: String) = new Customer(name,address)
  
  def apply(name: String) = new Customer(name, "Not mentioned")
  
  def main(args: Array[String]) {
    Customer.apply("Atilim Alci", "Kucukyali")
    Customer("Atilim", "Zumrutevler")
    Customer("Atilim")
  }
}
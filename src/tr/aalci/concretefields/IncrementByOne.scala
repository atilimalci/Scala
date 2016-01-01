package tr.aalci.concretefields

class IncrementByOne extends Counter {
  
  override def increment(): Unit = count+= 1
  
}
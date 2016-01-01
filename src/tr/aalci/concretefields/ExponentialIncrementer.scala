package tr.aalci.concretefields

class ExponentialIncrementer (rate: Int) extends Counter {
  def increment() : Unit = if (count == 0) count = 1 else count *= rate
}
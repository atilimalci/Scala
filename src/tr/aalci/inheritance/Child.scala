package tr.aalci.inheritance

class Child (name:String, address: String) extends Parent(name, address) {
  
  override def printName() {
    println("I am parent")
  }  
}
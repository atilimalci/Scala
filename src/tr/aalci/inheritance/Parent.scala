package tr.aalci.inheritance

class Parent (val name : String, address: String) extends Ordered[Parent] {
 
  def printName() {
    println("I am parent")
  }  
  
  def compare(that : Parent) : Int = name.compare(that.name)
}
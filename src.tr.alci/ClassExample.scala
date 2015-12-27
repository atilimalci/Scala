

class ClassExample(val name:String, val address: String) {
  private var _id = ""
  
  def id = _id
  
  //Overriden setter
  def id_=(value:String) {
    if (_id.isEmpty())
      _id = value
  }
}

object ClassExample {
  def main(args: Array[String]) {
    val atilim = new ClassExample("Atilim", "Zumrutevler")
    atilim.id = ("001")    
  }
}
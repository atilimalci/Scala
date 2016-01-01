package tr.aalci.beyondjava

class Directory {
  private val numbers = scala.collection.mutable.Map(
    "Athos" -> "7781",
    "Aramis" -> "7782", 
    "Porthos" -> "7783",
    "D'Artagnan" -> "7784"
  )
  
  def apply(name: String) = {
    numbers.get(name)
  }
  
  def update (name: String, number: String) = {
    numbers.update(name, number)
  }
  
  def update(areaCode: Int, newAreaCode :String) = {
    numbers.foreach(entry => {
      if (entry._2.startsWith(areaCode.toString()))
        numbers(entry._1) = entry._2.replace(areaCode.toString, newAreaCode)
    })
  }
  
  override def toString = numbers.toString()
  
}

object Directory {
  def main (args: Array[String]) {
    val yellowPages = new Directory()
    println("'Athos' telephone number: " + 
        yellowPages("Athos"))
        
    yellowPages("Athos") = "Unlisted"
    println("'Athos' telephone number: " + 
        yellowPages("Athos"))
        
    yellowPages(7782) = "8888"
    println(yellowPages)
  }
}
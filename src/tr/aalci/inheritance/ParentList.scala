package tr.aalci.inheritance


import scala.collection.mutable.ArrayBuffer

class ParentList extends Sortable[Parent]{
  private val parents = ArrayBuffer[Parent]()
  
  def add(parent: Parent) = parents+=(parent)
  
  def iterator: Iterator[Parent] = parents.iterator 
}

object Customers {
  def main(args : Array[String]) {
    val parentList = new ParentList()
    
    parentList.add(new Parent("Esra A.", "Kucukyali"))
    parentList.add(new Parent("Atilim A.", "Zumrutevler"))
    
    println(parentList.sort)
  }
}
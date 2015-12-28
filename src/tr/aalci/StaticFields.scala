package tr.aalci

class StaticFields (val name : String, val address:String) {
  private val id = StaticFields.nextId()  
}

object StaticFields {
  //Static field
  private var sequenceOfIds = 0
  
  private def nextId() = {
    sequenceOfIds += 1
    sequenceOfIds
  }
}
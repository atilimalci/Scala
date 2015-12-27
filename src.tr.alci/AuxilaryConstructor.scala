

class AuxilaryConstructor (forename: String, initial: String = "", surname:String) {
  val fullname = if (initial != null && !initial.isEmpty)
     forename + " " + initial + ". " + surname
  else
    forename + " " + surname
  
//  val fullname = String.format("%s %s. %s", forename, initial, surname)
  
//  def this(forename: String, surname: String) {
//    this(forename, "", surname)
//  }
}

object AuxilaryConstructor {
  def main(args : Array[String]) {
    new AuxilaryConstructor("Atilim", "J", "Alci")
    new AuxilaryConstructor("Atilim", surname = "Alci")
  }
}
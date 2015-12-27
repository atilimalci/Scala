/**
 * Examples of control structures.
 * 
 * aalci
 */
class ControlStructures {

}

object ControlStructures {

  def main(args: Array[String]) {
    //=====1
    var i = 2;
    var j = 3;

    if (i > j) println(i) else println(j)
    
    
    //=====2
    val n = i > j match {
      case true => i
      case false => j
    }
    
    println(s"Value of n is ${n}")
    
    //=====3
    val day = "MON"
    
    val kind = day match {
      case "MON" | "TUE" | "WED" | "THU" | "FRI" => "weekday"
      case _ => "weekend"
    }
    
    println(s"kind is: ${kind}")
    
    //=====4
    val y : Any = 12180
    
    var t = y match {
      case n : String => s"'n''"
      case n : Double =>f"$n%.2f"
      case n : Int => s"${n}i"
    }
    
    println(s"value of t:${t}")
  }
}
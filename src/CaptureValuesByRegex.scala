
object Main {
  def main (args : Array[String]) {
    val input = "Coming here 2 nd time"
    val pattern = """.* here ([\d.]+) nd .*""".r
    val pattern(amount) = input
    
    println(amount.toDouble)
    
  }
  
}
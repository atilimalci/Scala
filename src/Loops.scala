

/**
 * Examples of loops
 * 
 * aalci
 */
class Loops {
  
}

object Loops {
  def main(args: Array[String]) {
    //1
    for (x <- 1 to 7) println(s"Day ${x}")
    
    
    //2
    val vector =  for (x <- 1 to 7) yield {s"Day ${x}"}
    println(s"${vector}")
    
    //3
    val threes = for (i<-1 to 20 if i%3 == 0) yield i
    println(s"Threes=${threes}")
    
    //4 Nested loop
    for ( x <- 1 to 2;
          y <- 1 to 3 )
    {  println(s"(${x},${y})") }
    
    
    //5 Value binding in for loop
    var powersOf2 = for (i <- 0 to 8; p = 1 << i) yield p
    
    println(s"powersOf2:${powersOf2}")
    
    //6 While
    var x =10;
    while (x>0) {
      println (s"${x}")
      x -=1
    }
  }
}
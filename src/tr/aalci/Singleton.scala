package tr.aalci

import java.util.logging.Level

object Singleton {
  def log(level: Level, string : String) {
    printf("%s %s%n", level, string)
  }
  
  def main(args: Array[String]) {
    Singleton.log(Level.INFO, "Scala version")
  }
}


object AssertionsExample {
  def main(args: Array[String]): Unit = {
 val left = 2
val right = 2
assert(left == right)
//if assertion fails it will throw error as below
 /*
 Exception in thread "main" java.lang.AssertionError: assertion failed
	at scala.Predef$.assert(Predef.scala:156)
	at AssertionsExample$.main(AssertionsExample.scala:7)
	at AssertionsExample.main(AssertionsExample.scala)*/

  }
}
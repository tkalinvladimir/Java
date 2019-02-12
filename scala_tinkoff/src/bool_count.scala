import scala.io.StdIn.readLine

object bool_count extends App{
  var x: Int = readLine().toInt
  println(Integer.bitCount(x))
  var count = 0;
  while (x > 0) {
      if ((x & 1) == 1) {
        count = count + 1
      }
    x >>= 1
  }

  println(count)



}

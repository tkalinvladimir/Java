import scala.annotation.tailrec

object test {
  val mul3 = 3*(_: Double)
  val pow2 = (x: Double) => x*x
  def main(args: Array[String]): Unit = {
   // println(searchInArray(List(8,11,12))) // List(11)
    }

  @tailrec
  def fibs(n: Int, currentNumber: Int = 1, f1: Long = 0, f2: Long = 1): Long = {
    if (n == currentNumber)
      f2
    else {
      //put your code here
    }
  }
  println(fibs(n))
  }


def fibs (n: Int, currentNumber: Int = 1, f1: Long = 0, f2: Long = 1): Long = {
  @annotation.tailrec
  def getTailRec(n: Int, prev: Int, currentNumber: Int): Long = {
    if (n <= 0) {
      currentNumber
    } else {
      getTailRec(n - 1, prev = prev + currentNumber, currentNumber = prev)
    }
  }

  getTailRec(n, prev = 1, currentNumber = 0)
}


def fibs(num: Int): Any = {
  @tailrec
  def go(n: Int, acc:Int, x:Int): Int = n match {
    case 0 => acc
    case _ => go(n-1, x, acc+x)
  }
  return go(num, 0, 1)
}
}




object Main {
  def main(args: Array[String]): Unit = {
    println(double(2.2))
  }

  private def double(number: Double): Double = {
    number * 2
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val numberList = (0 until 10).map(_ => (Math.random()*100).toInt).toList

    println(oddNumbersInList(numberList).mkString(", "))
  }

  private def oddNumbersInList(numberList: List[Int]): List[Int] = {
    numberList.filter(_%2 != 0 )
  }
}

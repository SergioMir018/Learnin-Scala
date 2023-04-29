/**
 * Crear una función que tome un entero y devuelva una lista con los números del 1 al entero.
 * */

object Main {
  def main(args: Array[String]): Unit = {
    println(listToNumber(5))
  }

  private def listToNumber(number: Int): List[Int] = {
    var listNumber: List[Int] = List[Int]()

    for (i <- 1 to number) {
      listNumber = listNumber :+ i
    }
    listNumber

    /**
     * La solucion mas optima a esto es: List.range(1, number + 1)
     * */
  }
}

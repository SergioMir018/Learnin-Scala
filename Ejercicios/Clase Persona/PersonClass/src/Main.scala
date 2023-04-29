/*
* Crear una clase Person con dos atributos: name (cadena de caracteres) y age (entero). Crear un objeto Person y
* acceder a sus atributos.
* */

object Main {
  def main(args: Array[String]): Unit = {
    val person = new Person("Sergio", 20)

    println(s"This person name is: ${person.getName()} and his name is ${person.getAge()}")
  }
}

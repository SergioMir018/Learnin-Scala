package com.scala.functional

import scala.annotation.tailrec
import scala.language.postfixOps

object Main {
  def main(args: Array[String]): Unit = {
    //functional value
    val sum = (a: Int, b: Int) => a + b
    println(sum(1,2))

    /**
     * La sintaxis val areaOfRectangle:(Int, Int) => Int significa que areaOfRectangle es
     * una variable inmutable (declarada con val) que se define como una función que toma
     * dos argumentos enteros y devuelve un resultado entero. Esto es una funcion de orden
     * superior
     * */
    val rectangleArea: (Int, Int) => Int = (width: Int, height: Int) => {
      width * height
    }
    println(rectangleArea(4, 5))

    val add = (x: Int, y: Int) => {x + y}

    //Al coincidir la signature de .add() con el parametro de .operation() la podemos pasar
    //como parametro de este
    operation(add)

    def greeting() = (name: String) => {s"greetings $name"}
    val greet = greeting()
    println(greet("Sergio"))

    //Funcion parcialmente indicada
    val multiplier = (a: Int, b:Int) => {a * b}
    val partialMultiplier = multiplier(2, _:Int)
    println(partialMultiplier(2))

    println(factorial(1,3))
    println(fibonacci(3))
  }

  //Funcion que toma una funcion como parametro
  private def operation(functionParam: (Int,Int) => Int): Unit = {
    println(functionParam(4,4))
  }

  /**Funcion recursiva, que implementa la optimizacion de recursion de cola, la cual se usa llamando a la funcion
  como la ultima operacion de la funcion, en este caso tenemos un parametro accumulator que va a almacenar el valor
   de la secuencia de fibonacci para futuras iteraciones de la llamada a la funcion recursiva frames
   */
  @tailrec
  private def factorial(accumulator: Int,number: Int): Long = {
    if (number == 1) {
      return accumulator
    }
    factorial(number * accumulator, number - 1)
  }

  private def fibonacci(number: Int): Long = {
    var result = 1
    var result2 = 1

    //Ya que el iterador del bucle no se va a usar lo podemos sustituir por _
    for (_ <- 1 until number) {
      result += result2
      result2 += result
    }
    result
  }
}



import java.util.Date

object Main {
  def main(args: Array[String]): Unit ={
    val salute = "Hello, Scala! (^3^)"
    println(salute)
    println(salute.length)

    val actualDate = new Date()
    println(actualDate)

    for (i <- 1 to 10) {
      if (i < 10) {
        print(i + ", " )
      } else {
        print(i)
      }
    }

    for {i <- 1 to 10
         j <- 1 to 10} {
      println(i * j)
    }

    println(stringExample("Sergio"))

    val books = List("Beginning Scala", "Beginning Groovy", "Beginning Java", "Scala in easy steps",
      "Scala in 24 hours")

    //var books: Array[String] = new Array[String](length)

//    for (book <- books
//         if book.toLowerCase().contains("scala")) {
//      val bookVal = book.toUpperCase()
//      println(bookVal)
//    }

    val scalaBooks = for {
      book <- books
      if book.contains("Scala")
    } yield book

    println(scalaBooks)

    //val shape = new Shape
    val circle = ShapeFactory(3)
    val rectangle = ShapeFactory(2,3)

    println(circle.area)
    println(rectangle.area)

    println(sum(1,2,3,4))

    delayed(nano())

    Bicycle.drive()

    val myCar = new Car(180)
    val myBatmobile = new Batmobile(300)
    val randomVehicle = new Vehicle(130)

    val vehicles = List(myCar,myBatmobile,randomVehicle)

    val theFastestVehicle = fastestVehicle(vehicles)
    println(s"The fastest vehicle is a ${theFastestVehicle.vehicleType()} and goes up to ${theFastestVehicle.mph} mph")

    val stuff = classStuff("Sergio", 20)
    println(stuff.toString)
    println(stuff.name)
  }
}

private def stringExample(word: String): String = {
  s"The method received this word: $word"
}

private def sum[T <:Number](as:T*): Double = as.foldLeft(0d)(_ + _.doubleValue)

private def nano() = {
  println("Getting nano")
  System.nanoTime()
}

private def delayed (t: => Long): Unit = {
  println("In delayed method")
  println(s"Parameter: $t")
}

private def fastestVehicle(vehicles: List[Vehicle]): Vehicle = {
  vehicles.maxBy(_.mph)
}
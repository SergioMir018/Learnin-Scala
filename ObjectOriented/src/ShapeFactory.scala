//Companion object of Shape trait
object ShapeFactory {
  private class Circle(val radius: Double) extends Shape {
    override def area: Double = Math.PI * radius * radius
  }

  private class Rectangle(val width: Double, val height: Double) extends Shape {
    override def area: Double = width * height
  }

  def apply(width :Double, height :Double) : Shape = new Rectangle(width, height)
  def apply(radius: Double) : Shape = new Circle(radius)
}

class Car (speed : Int) extends Vehicle(speed) {
  override val mph: Int= speed
  override def race(): Unit = println("Racing Car")
  override def vehicleType(): String = "Car"
}

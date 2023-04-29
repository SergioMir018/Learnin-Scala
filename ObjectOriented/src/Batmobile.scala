class Batmobile (speed: Int) extends Vehicle(speed) with gliding with flying {
  override val mph: Int = speed

  override def race(): Unit = println("Racing Batmobile")

  override def flying(): Unit = println("Flying Batmobile")

  override def gliding(): Unit = println("Gliding Batmobile")
  
  override def vehicleType(): String = "Batmobile"
}

package _mydemo

class Complex (real: Double, val imaginary: Double) {
  def re = real
  def im = imaginary
  override def toString() = 
    "" + re + (if (im < 0 ) "" else "+") + im + "i"
}
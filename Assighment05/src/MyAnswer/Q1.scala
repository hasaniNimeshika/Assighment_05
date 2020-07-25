package MyAnswer

object Q1 extends App {
   val r1 = new Rational(2,3)
  println(r1)
  println(r1.neg)
  
  

}

class Rational(n:Int,d:Int){

  def numer=n
  def denom=d
 
  def neg = new Rational(-this.numer,this.denom)
  
  
  override def toString= numer+"/"+denom
  
}

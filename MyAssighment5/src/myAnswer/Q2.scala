package myAnswer

object Q2 extends App {
  
  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)
  val sub = x-y-z
  println("Answer is :"+sub)
}

class Rational(n:Int,d:Int){
  def numer=n/gcd(n,d)
  def denom=d/gcd(n,d)
  
  private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b) 
  
  def +(r:Rational) = new Rational(this.numer *r.denom +r.numer * this.denom, denom * r.denom)

  
  def neg = new Rational(-this.numer,this.denom)
  def -(r:Rational) = this+r.neg
  
  override def toString= numer+"/"+denom
}
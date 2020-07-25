package MyAnswer

object Q3 extends App {
  var bank:List[Account]=List()
  var a1 = new Account("976781v",1324,500) 
  var a2 = new Account("976784v",5678,1000) 
  var l = a1.transfer(a2,100)
  
}

class Account(id:String,n: Int,b: Double) {
val nic:String=id
val acnumber: Int = n
var balance: Double = b
override def toString ="["+nic+":"+acnumber +":"+ balance+"]"

def withdraw(a:Double) =this.balance=this.balance-a
def deposit(a:Double) =this.balance=this.balance+a
def transfer(a:Account,b:Double)= {
  this.balance=this.balance-b
  a.balance = a.balance+b
  
  println("Afeter transfer your account balance :"+this.balance)
  println("Deposited account balance :"+a.balance)
}
  

}
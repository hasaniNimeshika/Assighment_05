package myAnswer

object Q4 extends App {
 
  var a1 = new Account("976781v",1324,-9) 
  var a2 = new Account("976784v",5678,-600) 
  var a3 = new Account("977884v",5308,500) 
  
  
 var bank:List[Account]=List(a1, a2, a3) //added items to the list

 val overdraft=(b:List[Account])=> b.filter(x=>x.balance<0)
 println("Accounts with negative balances : "+overdraft(bank)) //filtered the list using overdraft
 
 val inte=(b:List[Account])=>b.map(x=>x.balance)
 
 val bal=inte(bank).reduce((x, y)=>x+y)
 println("Sum of all account balances :"+bal)
  
 val interest=(b:List[Account])=>b.map(x=>(x.nic, x.acnumber, if(x.balance<0){x.balance+0.1} else x.balance+0.05))
 println("final balances of all accounts after apply the interest function :"+interest(bank))
 

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
}
  

}
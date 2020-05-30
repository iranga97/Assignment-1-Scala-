object Salary extends App {
  def normalSalary(hours:Int)=hours*150;
  def otSalary(hours:Int)=hours*75;
  def income(normal:Int,ot:Int)=normalSalary(normal)+otSalary(ot);
  def tax(income:Int)=income*0.1;
  def takehomeSalary(normal:Int,ot:Int)=income(normal,ot)-tax(income(normal,ot));
  println(takehomeSalary(40,20));	
}
object tickPrice extends App {
  def attendees(price:Int)=120+(15-price)/5*20;
  def revenue(price:Int)=attendees(price)*price;
  def cost(price:Int)=500+attendees(price)*3;
  def profit(price:Int)=revenue(price)-cost(price);
  
  println(profit(5),profit(10),profit(15),profit(20),profit(25),profit(30));	
}
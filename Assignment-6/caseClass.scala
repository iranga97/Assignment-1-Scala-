object caseClass extends App{
    val pnt1 = Point(5,10)
    val pnt2 = Point(4,1)
    val pnt3 = pnt1 + pnt2
    val pnt4 = pnt1.move(2,9)
    val distant = pnt1.distance(5,4)
    val pnt5 = pnt2.invert()
    

   
    print("Question 1 Answer:")
    println(pnt3)
    
    print("Question 2 Answer:")
    println(pnt4)
    
    print("Question 3 Answer:")
    println(distant)    

    print("Question 4 Answer:")
    println(pnt5)
    

}

case class Point(a:Int,b:Int){
    def x:Int = a;
    def y:Int = b;
    
    def +(that:Point) = Point(this.x+that.x,this.y + that.y)  //adding two points 
    
    def move(dx:Int,dy:Int) = Point(this.x + dx,this.y+dy)  //move the point by given distance
    
    def distance(dx:Int,dy:Int): Double = scala.math.sqrt(scala.math.pow(this.x - dx, 2) + scala.math.pow(this.y - dy, 2))  //get the sqrt value of x^2 + y^2
    
    def invert() = Point(this.y,this.x)  //change the x and y cordinates
}
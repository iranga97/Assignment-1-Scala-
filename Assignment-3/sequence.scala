object sequence extends App{
  def prime(p:Int,n:Int=2):Boolean= n match {
   case x if(x==p) => true
   case x if GCD(p,x)>1 => false
   case x => prime(p,x+1)
 
  }
   def GCD(a:Int,b:Int):Int = b match {
        case 0 => a
        case x if(x>a) =>GCD(x,a)
        case _ => GCD(b,a%b)
    }
  def printSequence(n:Int):Unit={
        var j =2;
        while(j<=n){
            if(prime(j)){
                println(j);
            }
            j = j+1;
        }
  }
  printSequence(100);
}
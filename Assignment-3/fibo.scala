object FibonacciSeries extends App{
    def fiboNum(n:Int):Unit ={
       var i=0;
       while(i<=n){
           print(fibo(i)+" ");
           i= i+1;
       }
       println();
    }
    
    def fibo(x:Int): Int=x match {
        case x if(x==0) => 0
        case x if(x==1) => 1
        case x => fibo(x-1) + fibo(x-2)
    }
    fiboNum(5);
    fiboNum(10);
    
}
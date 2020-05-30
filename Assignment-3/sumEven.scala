object SumEvenNo extends App{

    def isEven(n:Int): Boolean = n match {
        case x if(x%2 == 0) => true
        case _ => false
    }
    def EvenSum(a:Int): Int = a match {
        case 0 => 0
        case x if(isEven(x)) => x + EvenSum(x-1)
        case x if(!isEven(x)) => EvenSum(x-1)
    }
    println(EvenSum(10));
    
}
object OddOrEven extends App{

    def isEven(n:Int): Boolean = n match {
        case x if(x%2 == 0) => true
        case _ => isOdd(n-1)
    }
    def isOdd(n:Int): Boolean = !(isEven(n))
    println(isEven(2));
    println(isEven(3));
}
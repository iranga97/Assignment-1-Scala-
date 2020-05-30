object Sum extends App{
    def sum(x:Int): Int = x match {
        case 0 => 0
        case _ => x + sum(x-1)
    }
    println(sum(5));
    println(sum(20));
    
}
object FactorialRecursion {

    def main(args: Array[String]) {
        val a = factorial(5)
        println(a);
    }

    def factorial(n: Int): Int = {
      if(n == 0) 
          return 1
      else
          return n * factorial(n-1)
    }
}

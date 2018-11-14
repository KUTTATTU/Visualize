object A{
  def main( args:Array[String]){
	gcd(5,7);
    }

  def gcd(a: Int, b: Int): Int ={
	 if(b == 0) 
		a 
	 else 
  		gcd(b, a % b)
}

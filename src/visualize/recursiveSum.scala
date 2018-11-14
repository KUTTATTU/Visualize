object b{
	def recursiveSum(a: Int, b: Int): Int = {
    		if(a > b) 0
    		else {
        		a + recursiveSum(a+1,b)
    		}
	}
	def main(args:String[Args])
	{
		recursiveSum(8,9)
	}
}

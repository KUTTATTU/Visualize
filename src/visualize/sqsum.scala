object SqSum
{
	def main(args: Array[String])
	{
		var ans = 0;
		var i = 0;
		for(a <- 1 to 10)
		{
			ans = ans + square(a)	
		}
		println(ans)
	}

	def square(a:Int)
	{
		var sq:Int = 0
		sq = a * a
		return sq
	}
}

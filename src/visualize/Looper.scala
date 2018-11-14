 object fnamedparameters {  
       def main(args: Array[String]) = {  
		for(i<-1 to 10){  
            var result1 = functionExample(a = 15, b = 2)    
            var result2 = functionExample(b = 15, a = 2) 
            var result3 = functionExample(15,2)            
            println(result1+"\n"+result2+"\n"+result3)  
			}
        }  
        def functionExample(a:Int, b:Int):Int = {  
            a-b  
        }  
}

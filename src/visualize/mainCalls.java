package visualize;

import java.nio.file.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mainCalls {
    public static String readFileAsString(String fileName) throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
    public static void functioncalls(String data) throws Exception {
    	 Pattern p = Pattern.compile("([a-zA-Z]+\\([^\\)]*\\))");
         Matcher m = p.matcher(data);
         while(m.find()) {
             String theGroup = m.group(1);
             if(!theGroup.matches("(while|println|print|for|if).*"))
             {
            	 System.out.println(theGroup); 
             }
            
         }
    }
    
    public static String bodycontent(String data,Matcher m)throws Exception{
    	 int s=0,e=0,count=0;
         boolean flag=true;
    	 String maincontent=data.substring(m.start());
   	     Pattern ps = Pattern.compile("([{]|([}]))");
         Matcher ms = ps.matcher(maincontent);
         while(ms.find()) {
             String theGroups = ms.group(1);
             if(theGroups.matches("\\{")&&flag)
             {
           	s=ms.end();
           	count+=1;
           	
           	flag=false;
             }
             else if(theGroups.matches("\\{"))
             {
           	 count+=1; 
             }
             else if(theGroups.matches("\\}"))
             {
           	  count-=1;
           	  if(count==0)
           	  {
           		  e=ms.end();
           		  break;
                 }
             }
         }
         return(maincontent.substring(s,e));
    }

    public static void main(String[] args) throws Exception {
        String data = readFileAsString("/home/kuttattu/eclipse-workspace/visualize/src/visualize/test2.scala");
        Pattern p = Pattern.compile("(main(\\S+))");
        Matcher m = p.matcher(data);
        while(m.find()) {
                  functioncalls(bodycontent(data,m));  
            }
        }
    }



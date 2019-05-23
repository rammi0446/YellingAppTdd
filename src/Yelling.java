
public class Yelling {
	
private static boolean isStringUpperCase(String str){
        
        //convert String to char array
        char[] charArray = str.toCharArray();
        
        for(int i=0; i < charArray.length; i++){
            
            //if any character is not in upper case, return false
            if( !Character.isUpperCase( charArray[i] ))
                return false;
        }
        
        return true;
    }



public String Scream(String[] result)
{
	//one person is yelling
	boolean checkCase = false;
	
	if(result[0]!= "NULL" && result.length == 1)
	{
		String yelling = " is yelling";
		 checkCase = isStringUpperCase(result[0]);
		if(checkCase == true)
		{
			yelling = yelling.toUpperCase();
		}
		return result[0] +yelling;	
	}
	
	
	//two or more than two person yelling
	else if(result.length >= 2)
	{
		String yelling = " is yelling";
		String all = "";
		String Upper = "";
		for(int i = 0; i< result.length ; i++)
		{

			checkCase = isStringUpperCase(result[i]);
			if(checkCase == true)
			{
				Upper = result[i];
				all =	all + result[i] ; 
			}
			else if(checkCase == false)
			{
				all =	all + result[i] ; 
				if(i<(result.length-2))
				{
					all = all + " , ";
				}
				else if((result.length-2) == i)
				{
					all = all + " and ";
				}
			}
				
		}	
		if(checkCase == true)
		{
			return all + yelling + ", so is" + Upper;
		}
		return all + yelling;
		
	}
	
	
	return "Nobody is yelling";
	
	
}
}

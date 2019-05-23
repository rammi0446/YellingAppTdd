
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
	
	if(result[0]!= "NULL" && result.length == 1)
	{
		String yelling = " is yelling";
		boolean checkCase = isStringUpperCase(result[0]);
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
		for(int i = 0; i< result.length ; i++)
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
		return all + yelling;
		
	}
	
	
	return "Nobody is yelling";
	
	
}
}

package ExercisesIntermediate;

public class Continued 
{

	int a, b, c;
	int temperature;
	Boolean isSummer = false;
	
			
	public int UniqueSum() 
	{
		if(a == b) 
	    { 
		   return c;
		}
		if(a == c) 
		{
			return b;
		}
		if(c == b) 
		{
			return a;
		}
		else if (a != b) {}

		else if (a == b && b == c)
			return 0;
		return a + b + c;	 
	}
	
	public Boolean TooHot() 
	{
		if (temperature <= 100 && temperature >= 60 && isSummer == true) 
		{
	    	return true;
	    }

	
	    else if (temperature <= 90 && temperature >= 60 && isSummer == false) 
	    {
	    	return true;
	    }
	    else {}
	    	
		return false;
	}
}

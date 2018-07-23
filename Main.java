package ExercisesIntermediate;

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	
		Continued s = new Continued();
		Continued x = new Continued();
		s.a = 6;
		s.b = 5;
		s.c = 7;
	    x.temperature = 95;
		System.out.println("The unqiue sum is:");
		System.out.println(s.UniqueSum());
		System.out.println(x.TooHot());
	}

	
}

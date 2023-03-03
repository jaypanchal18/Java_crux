package session3;

public class logical_operators {

	public static void main(String[] args) {
		
		// && operator
		int eng = 82;
		int maths = 43;
		if(eng>=90 && maths>=43)
		{
			System.out.println("you will get a chocolate");
		}
		else
		{
			System.out.println("you will get a slap");
		}
		
		// || operator
		
		int english = 82;
		int math = 43;
		if(english>=90 || math>=43)
		{
			System.out.println("you will get a chocolate");
		}
		else
		{
			System.out.println("you will get a slap");
		}
		
		// ! operator
		
		System.out.println(!(10>90));
		System.out.println(!(90>10));
	
		

	}

}

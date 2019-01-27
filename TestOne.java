//import java.util.Scanner;
public class TestOne 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*Scanner userInput = new Scanner(System.in);
		System.out.println("how old are you?");
		
		int age = userInput.nextInt();
		System.out.println("You are " + age + "years old");*/
		
		int age = 17;
		System.out.println("I am " + age + " years old.");
		
		System.out.println("Next year I will be " + (age+1) + " years old.");
		System.out.println(50%7);
		
		System.out.println(average(5,12));
		
		int x = 10; 
		int y = 55;
		double z = average(x,y);
		System.out.println(z);
		
	}
	public static double average(int num1, int num2)
	{
		return (double)(num1+num2)/2;
		
	}
}

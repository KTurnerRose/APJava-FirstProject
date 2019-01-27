
public class FirstFile 
{

	public static void main(String[] args) 
	{
		double average = avg(5,10);
		System.out.println("the result of the first avg function: " + average);
		//average = local variable which can't be used after it's printed
		
		double avg2 = avg(25.14,44.3);
		System.out.println("the result of the second avg function: " + avg2);
		
		/*method overloading = you have two methods with the same name but w either diff
		  parameter types or orders (in this case, diff entered parameter types)
		 */
		
		int a = 2;
		double b = 2.5;
		double avg3 = avg(a,b); 
		/*will choose the avg function which accepts entered integers*/
		System.out.println("the result of the third avg function: " + avg3);
		
		int[] values = {5,9,2,1,11};
		double avg4 = avg(values);
		System.out.println("the result of the fourth avg function: " + avg4);
		
		int[] valuesTwo = add1(values);
		printArr(valuesTwo);
		
		/* --> when we print out an object like an array, you will only get its memory address 
		 * (which appears as something like [I@15db9742 )*/
		
		double[] gpa = new double[8]; //creating new EMPTY array w 8 slots
		gpa[0] = 100;
		gpa[1] = 50;
		gpa[2] = 66;
		gpa[3] = 95.4;
		gpa[4] = 88.56;
		gpa[5] = 33.87;
		gpa[6] = 0.1;
		gpa[7] = 75.4;
		
		//if u try to fill position 8 in the array,  there would be a compile error (position 0 = first position; index of 0)
		double avg5 = avg(gpa); /*passing gpa, a double array*/
		highestVal(values);
		
		System.out.println("the result of the double avg function: " + avg5);
		
		String firstName = "Amanda";
		String lastName = "Lin";
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		String initial = firstName.substring(0,1);
		System.out.println(initial + " " + lastName + " is studying Java.");
		/*substring method: SYNTAX = substring(start position, stop position) -> in this case you're starting at the first letter and ending on
		 * the space after it, resulting in the first initial of person's name
		 * HOW TO GET LAST LETTER OF ANY STRING:
		 * (fullName.length-1, firstName.length)
		 */
		
		String[] names = {"Rafia", "Ellen", "Brittany", "Karla", "Raymond", "Cole", "Roxy", "Kaylee", 
							"Justin", "Kobe", "Way Laoshi", "Nicki"};
		printArr(names);
		/*String text = "banana";
		text = reverseWord(text);
		System.out.println(text);
		*/
		reverseWord("tumblr");
		int array[] = {5,10,16};
		printArrayBackwards(array);
		printArr(buildArrayBackwards(array));
		
		System.out.println(primeTest(73));
		
		
	}
	public static double avg(int num1, int num2)
	{
		return (double)(num1+num2)/2;
		//can also say return (num1+num2)/2.0;
	}
	public static double avg(double num1, double num2)
	{
		return (num1+num2)/2;
		
	}
	public static double avg(int[] numbers) //int array
	{
		int total = 0;
		for (int i = 0; i < numbers.length; i++) //i disappears  as soon as for loop is exited
			total += numbers[i];

		return (double) total / numbers.length;
	}
	public static double avg(double[] values) //double array
	{
		if (values.length == 0)
			return Integer.MIN_VALUE; //stores the smallest value that could fit into an integer (closest to -2^31)
		
		int total = 0;
		for (int i = 0; i < values.length; i++) //i disappears  as soon as for loop is exited
			total += values[i];

		return (double) total / values.length;
	}
	public static String lastCharacter(String str) 
	{
		if(str.length() == 0)
			return "";
		return str.substring(str.length() - 1);
	}
	public static int[] add1(int[] numbers) //int array
	{
		int[] numArray = new int[numbers.length]; /*creating a new array with the same length as of the input array*/
		for (int i = 0; i < numbers.length; i++) //i disappears  as soon as for loop is exited
			numArray[i] = numbers[i] + 1;
		return numArray;
	}
	public static void printArr(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
			if(i != arr.length - 1)
			{
				System.out.print(", ");
			}
		}
		System.out.println();	
	}
	//received int array, returns highest value
	public static int highestVal(int[] original)
	{
		if (original.length == 0)
		{
			return Integer.MIN_VALUE; //if array is empty, will return the lowest possible int value
		}
		
		int highest = Integer.MIN_VALUE;
		for (int i = 0; i < original.length; i++)
		{
			if(original[i] > highest)
				highest = original[i];
				System.out.println("i = " + i + ", highest = " + highest);
		}
		System.out.println("The highest value in this array is: " + highest);
		return highest;
	}
	public static void printArr(String[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i] + ", ");
			if(i == arr.length - 1)
			{
				System.out.print(arr[i]);
			}
		}
		System.out.println();
	}
	public static String reverseWord(String word)
	{
		String newWord = "";
		for (int i = word.length() - 1; i >= 0; i--)
		{
			/*can ONLY use ++ when it's the only command in a string of code 
			 * -> y= x++; first increments and then assigns (first y=4, then x=5)*/
			newWord = newWord + word.substring(i, i+1);
		}
		System.out.println("The new word is: " + newWord);
		return newWord;
	}
	public static void printArrayBackwards(int[] array)
	{
		for (int i = array.length - 1; i >= 0; i--)
		{
			System.out.print(array[i]);
			if (i != 0)
				System.out.print(", ");
		}
		System.out.println();
	}
	public static int[] buildArrayBackwards(int[] array)
	{
		int[] backwards = new int[array.length];
		int k = 0;
		for (int i = array.length - 1; i >= 0; i--)
		{
			backwards[k] = array[i];
			k++;
		}
		return backwards;
	}
	//determine whether or not int is a prime number or not
	public static boolean primeTest(int num)
	{
		//return statements exit method; numbers less than two dont go thru any other conditionals                                                                                                                                                                                                                                          
		if (num <= 2) //anything less than two is NOT prime
			return true;
		if(num%2==0) //if num is a multiple of 2
			return false;
		int maxTest = (int)(Math.sqrt(num)); //the maximum test number num is divided by is the int version of the square root of num! ex. the integer square root of 53 is 7, which is the last number it is tested with
		for (int divideBy = 3; divideBy <= maxTest; divideBy = divideBy + 2)
		//if num can be divided by any odd number which is more than/equal to 3 AND less than/equal to maxTest number with NO remainder, it's NOT prime
		{
			if (num % divideBy == 0)
				return false;
		}
		return true;
	}
}
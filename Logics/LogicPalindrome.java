
	import java.util.Scanner ;
	
class LogicPalindrome{
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = scanner.nextInt() ;
		int sum = 0 ;
		int num = number ;
		
		
		while(number!=0)
		{
			int rem = number%10 ;
			sum = (sum*10)+rem ;
			 number =number/10 ;
			
		}
		
		System.out.println(sum) ;
		
		if(sum==num)
		{
			System.out.println("number is polindrome");
		}
		else
		{
			System.out.println("number is not a Polindrome");
		}
			
	}
}
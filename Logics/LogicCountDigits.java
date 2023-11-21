import java.util.Scanner;

class LogicCountDigits{
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enetr number");
		int number = scanner.nextInt();
		
		int sum = 0;
		int count = 0 ;
		
		//for(int i=0; i<number;i++)
			while(number!=0)
		{
			int rem = number%10 ;
			sum = sum +rem ;
			++count ;
			number=number/10 ;
			
		}
		
		System.out.println("Number of Digits :"+count);
		System.out.println("the Sum of Digits :"+sum);
		
		/*Scanner sc= new Scanner(System.out);
		int num = sc.nextInt();*/
		
		
	}	
}
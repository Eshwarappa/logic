import java.util.Scanner;
//a number, the sum of the cubes of its digits is equal to the number itself ;

class LogicArmStrong{
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter Number");
		int number = scanner.nextInt();
		int num = number ;
		int sum =0;
		
		while(number!=0)
		{
			int rem=number%10 ;
			sum = sum +(rem*rem*rem);
				number = number/10 ;
			
		}
		System.out.println(sum);
		if(sum==num)
		{
			System.out.println("given number is ArmStrong :"+num);
		}else
		{
			System.out.println("given number is not Armstrong :"+num );
		}
		
	}
}
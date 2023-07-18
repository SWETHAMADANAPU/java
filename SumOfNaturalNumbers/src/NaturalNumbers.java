import java.util.Scanner;

public class NaturalNumbers {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);	
		System.out.println("enter number");
		int n=scanner.nextInt();

		int sum=0;

		for(int i=1;i<=n;i++)

		{

		sum=sum+i;

		}

		System.out.println("Sum is "+sum);
	}
}


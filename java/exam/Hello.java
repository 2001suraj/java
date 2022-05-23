package exam;

import java.util.Scanner;

public class Hello {
    public static void main(String arr[])
	{
		Scanner sc=new Scanner(System.in);
		int ch,i,c=0,n;
		System.out.println("Enter a number:");
		n=sc.nextInt();
		System.out.println("Press 1 for prime number and 2 for automorphic number");
		System.out.println("1.Prime Number");
		System.out.println("2.Automorphic Number");
		System.out.println("Enter your choice:");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				for(i=1;i<=n;i++)
				{
					if(n%i==0)
					c++;
				}
				if(c==2)
					System.out.println("Prime Number");
				else
					System.out.println("Not a Prime Number");
			break;
			case 2:
				for(i=n;i>0;i=i/10)
				{
					c++;
				}
				if((n*n)%(int)Math.pow(10,c)==n)
					System.out.println("Automorphic Number");
				else
					System.out.println("Not an Automorphic Number");
			break;
			default:
				System.out.println("Invalid choice");
		}
	}	
}

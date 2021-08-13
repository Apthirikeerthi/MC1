import java.io.*;
import java.util.Scanner;
public class ac4{

	public static void main(String[] args) {
		int num,fact=1;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
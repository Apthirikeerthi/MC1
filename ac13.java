import java.util.Scanner;

public class ac13{
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    int dif = 23;
	    int perimeter = 206;
	    int sum = perimeter/2;
	    int l=(dif+sum)/2;
	    int b=sum-l;
	    int area=l*b;
	    System.out.print("The area of rectangle is : "+area);
	}
}
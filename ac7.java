import java.util.*;

public class ac7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int ts, time,tl;
		System.out.print("Enter the train speed in km/hr : ");
		ts=sc.nextInt();
		System.out.print("\nEnter the time in seconds : ");
		time=sc.nextInt();
		tl = (ts * 1000 * time)/3600;
		System.out.print("The length of train is : "+tl+"m");
	}
}
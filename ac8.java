import java.util.*;

public class ac8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int tl,ms,time;
		System.out.print("Enter the train length : ");
		tl = sc.nextInt();
		System.out.print("Enter the man speed in km/hr : ");
		ms = sc.nextInt();
		System.out.print("Enter the time in seconds : ");
		time = sc.nextInt();
		int rts = ((tl*18)/(time*5));
		int ts= rts + ms;
		System.out.print("The speed of train in km/hr is : "+ts);
	}
}
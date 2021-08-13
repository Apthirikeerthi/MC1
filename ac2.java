import java.util.*;

public class ac2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num=10,maximum=0,count=0;
		int arr[]=new int[num];
		System.out.println("Enter 10 elements of array : ");
		for(int i=0;i<num;i++){
			arr[i]=sc.nextInt();
			if(arr[i]>maximum){
				maximum=arr[i];count=0;
			}
			if(arr[i]==maximum)
				count++;
		}
		System.out.print(count);
	}
}
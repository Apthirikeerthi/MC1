import java.io.*;
import java.util.Scanner;
public class ac1 {
public static void main(String[] args) {
int i,num=25;
Scanner sc=new Scanner(System.in);
int Array[];   
Array = new int[num];
		for(i=0;i<num;i++)
		{
		  Array[i]=sc.nextInt();	
		}
   int max = Array[0];
        for (i = 1; i < num ; i++){
            if (Array[i] > max)
                max = Array[i];
       
	}
System.out.println(max);
}
}

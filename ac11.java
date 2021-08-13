import java.io.*;
public class ac11{
    public static void main(String args[])
    {
	    int r=30,k=50,h1=5,h2=4;
	    float ra=r/(float)h1;
	    float ka=k/(float)h2;
        float c=(ra+ka);
	    float time=110/c;
	    int hr=(int)time;int mins = (int)((time-hr)*100);
	    int min = (mins*60/100);
	    System.out.println("The time taken by both to complete 110 pages is : "+hr+" hours "+min+" minutes");
	
    }
}
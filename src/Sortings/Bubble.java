package Sortings;
import java.io.*;
public class Bubble {
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of the array");
		int l=Integer.parseInt(br.readLine());
		int a[]=new int[l],t;
		System.out.println("Enter the elements of the array");
		for(int i=0;i<l;i++)
			a[i]=Integer.parseInt(br.readLine());
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println("Sorted Array");
		for(int i=0;i<l;i++)
			System.out.print(a[i]+" ");
	}
}
package Sortings;
import java.io.*;
public class Insertion {
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of the array");
		int l=Integer.parseInt(br.readLine());
		int a[]=new int[l];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<l;i++)
			a[i]=Integer.parseInt(br.readLine());
		int key,j;
		for(int i=0;i<l;i++)
		{
			key=a[i];
			j=i-1;
			while(j>=0&&a[j]>key)
			{
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
		System.out.println("Sorted Array");
		for(int i=0;i<l;i++)
			System.out.print(a[i]+" ");
	}
}
		
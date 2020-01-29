package Sortings;
import java.io.*;
public class SortRecursion {
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length of array");
		int len=Integer.parseInt(br.readLine());
		int a[]=new int[len];
		System.out.println("Enter elements of array");
		for(int i=0;i<len;i++)
			a[i]=Integer.parseInt(br.readLine());
		a=sort(a,0,0);
		print(a);
	}
	public static void print(int a[])
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	public static int[] sort(int a[],int pos,int i)
	{
		int t;
		if(i==a.length)
			return a;
		else if(pos<a.length-1-i)
		{
			if(a[pos]>a[pos+1])
			{
				t=a[pos];
				a[pos]=a[pos+1];
				a[pos+1]=t;
			}
			return sort(a,pos+1,i);
		}
		return sort(a,0,i+1);
	}	
}


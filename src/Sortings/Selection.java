package Sortings;
import java.io.*;
public class Selection {
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of the array");
		int l=Integer.parseInt(br.readLine());
		int a[]=new int[l],t,small,pos;
		System.out.println("Enter the elements of the array");
		for(int i=0;i<l;i++)
			a[i]=Integer.parseInt(br.readLine());
		for(int i=0;i<l-1;i++)
		{
			small=a[i];
			pos=i;
			for(int j=i+1;j<l;j++)
			{
				if(a[j]<small)
				{
					small=a[j];
					pos=j;
				}
			}
			t=a[i];
			a[i]=small;
			a[pos]=t;
		}
		System.out.println("Sorted Array");
		for(int i=0;i<l;i++)
			System.out.print(a[i]+" ");
	}
}

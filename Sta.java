import java.util.*;
class Sta
{
	public static void main(String s[])
	{
		int a[]=new int[15];
		Random r=new Random();
		int temp[]=new int[a.length];
		for(int i=0;i<temp.length;i++)
		{
			temp[i]=1;
			a[i]=r.nextInt(20)-10;
			System.out.println(a[i]+"  ");
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<i;j++)
			{
               if(a[j]<a[i]&&temp[j]+1>temp[i])
               {
                 temp[i]++;
               }
			}
		}	
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(temp[i]>max)
				max=temp[i];
		}
		System.out.println("max length of increasing subsequence in the array is "+max);
	}
}
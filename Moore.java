class Moore
{
	public static void main(String s[])//Moore's Voting Algo--only if one element occurs more than n/2 times
	{
		int a[]=new int[]{3,2,1,3,2,3,3};
		int temp=a[0];int count=1;
		for(int i=1;i<a.length;i++)
		{
      if(a[i]==temp)
      	 count++;
      	else
      	{
      		count--;
      		if(count++==0)
      		{
      			temp=a[i];
      		}
      	}
		}
		System.out.println(temp);
	}
}
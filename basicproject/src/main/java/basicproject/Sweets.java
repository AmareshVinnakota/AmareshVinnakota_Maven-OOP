package basicproject;

public class Sweets extends Choclates {
	int x,y,count=0,s=0,s1=0;
	Sweets(int x,int y)
	{
		super(x,y);
		
	}
	public int[] weight(int a[],int p[])
	{    int a1[]=new int[3];
	     
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]>x && a[i]<y)
			{
				count++;
				
			}
			s=s+a[i]*p[i];
			s1=s1+a[i];
			
		}
		a1[0]=count;
		a1[1]=s;
		a1[2]=s1;
		return a1;
	}

}

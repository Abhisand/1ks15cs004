package Array;

import java.util.Scanner;
public class Repeated {

	public static void main(String[] args) {
		
		int i,j,k,p;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements:");
		for(p=0;p<n;p++)
		{
			a[p]=s.nextInt();
		}
		
		
		for(i=0;i<n;i++)
		{
//			if(i!=-1)
//			{
                           int c=1;
//			if(i>0)
//			{
//                            for(j=0;j<i-1;j++)
//				{
//					if(a[i]==a[j])
//					{
//						continue;
//					} 
//				}
//			}
			for(k=i+1;k<n;k++)  
			{
				if(a[i]==a[k]&& a[i]!=-1)
                                {
                                    c++;
                                    a[k]=-1;
                                }
			}
			if(c>1)
				System.out.println("The number "+a[i]+" is repeated "+c+" times ");
				
		       }
              }

	}



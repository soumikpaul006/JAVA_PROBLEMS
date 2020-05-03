import java.util.Scanner;
import java.util.*;
import java.io.*;




class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long n =sc.nextLong();
			Long arr[] = new Long[(int)n];
			for(long i=0;i<n;i++)
				arr[(int)i] = sc.nextLong();
			A g = new A();
			System.out.println(g.thirdLargest(arr));
		t--;
		}
	}
}// } Driver Code Ends

class A
{
    long thirdLargest(Long a[])
    {
        if(a.length<3)
        {
            
            return -1;
        }
	  
	    long largest_num=a[0];
	    long second_largest=(long)Integer.MIN_VALUE;
	    long third_largest=(long)Integer.MIN_VALUE;
	    
	    
	    for(int i=1;i<a.length;i++)
	    {
	        if(a[i]>largest_num)
	        {
	            third_largest=second_largest;
	            second_largest=largest_num;
	            largest_num=a[i];
	        }
	        else if(a[i]>second_largest)
	        {
	            third_largest=second_largest;
	            second_largest=a[i];
	        }
	        else if(a[i]>third_largest)
	        {
	            
	            third_largest=a[i];
	        }
	        
	    }
	    return third_largest;
	   
    }
}

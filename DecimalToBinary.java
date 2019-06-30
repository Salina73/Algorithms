package com.bridgelab;
import java.util.*;
public class DecimalToBinary {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number which have to convert in binary:");
		int n=s.nextInt();
		List<String> a = new ArrayList<>();
		toBinary(n,a);
	}

	private static void toBinary(int n, List<String> a)
	{
		int d=n%2;
		if(n!=0)
		{
 			if(d==0)
 			{
 				a.add("0");
 				n=n/2;
 				toBinary(n,a);
 			}
 			if(d==1)
 			{
 				a.add("1");
 				n=n/2;
 				toBinary(n,a);
 			}	
		
		}
		else
		{
			String s1=a.toString().replaceAll(",", "").replace("[","").replace("]","");
			char[] s2 = s1.toCharArray();
			int s3=s2.length;
			for (int i = s3-1; i >= 0; i--) {  
	            System.out.print(s2[i] + " ");  
	        }  
		}
			
	}	
}

package com.bridgelab;
import java.util.*;
import java.util.Collections;
public class Binary {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number which have to convert in binary:");
		int n=s.nextInt();
		List<Integer> a = new ArrayList<>();
		toBinary(n,a);
		System.out.println();
		int c1=swapNibbles(n);
		int temp=c1;
		System.out.println("After swaping nibbles New number is "+c1); 
		if(c1>0){
			while(c1%2==0)
			{
				c1=c1/2;
			}
			if(c1==1)
				System.out.println(temp+" is power of 2");
		}
		if(c1==0||c1!=1)
			System.out.println(temp+" is not power of 2");
	
	}

	private static void toBinary(int n, List<Integer> a)
	{
		int d=n%2;
		int c=0,c1=1;
		if(n!=0)
		{
 			if(d==0)
 			{
 				a.add(c);
 				n=n/2;
 				toBinary(n,a);
 			}
 			if(d==1)
 			{
 				a.add(c1);
 				n=n/2;
 				toBinary(n,a);
 			}		
		}
		else
		{
			Collections.reverse(a);
			String s1=a.toString().replaceAll(",", "").replace("[","").replace("]","");
			System.out.println(s1);		
		}		
	}

	private static int swapNibbles(int n) {
		 return ((n & 0x0F) << 4 | (n & 0xF0) >> 4); 
	}	
}

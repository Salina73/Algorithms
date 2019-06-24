package com.bridgelab;
import java.util.*;
import util.Utility;

public class VendingMachine {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Rs.");
		int a=s.nextInt();
		int i=0;
		//int[] c= {1000,500,100,50,10,5,2,1};
		Utility.VM(a,i);
	}
}

package util;
import java.util.*;

public class Utility12 {

		public Utility12()
		{
		
		}

		public static void Prime1()
		{	
			int l,k,c=0,i=1;
			int[] a=new int[1000];
			a[0]=2;
			 System.out.print(a[0]+",");
	        for(l=2;l<=1000;l++)
	        {
	               for(k=2;k<l;k++)
	               {
	                   if(l%k==0)
	                   {
	                       c=0;
	                       break;
	                   }
	                   else
	                   {
	                       c=1;
	                   		
	                   }
	               }
	               if(c==1)
	               {
	                   a[i]=l;
	                   System.out.print(a[i]+",");
	                   i++;   
	               }
	         }
	        int d=i;
	        System.out.println();
	        System.out.println();
	        palindrome(a,d);
	       anagram();
		}
		private static void palindrome(int[] a,int d)
		{
			int i,num,sum=0,temp,k=0;
			int[] b=new int[d];
			 System.out.println();
			 System.out.println("Palindromes are...");
			for(i=0;i<d;i++)
			{
				temp=a[i];
				while(a[i]>0)
				{
					num=a[i]%10;
					sum=(sum*10)+num;
					a[i]=a[i]/10;
					if(temp==sum)
					{
						b[k]=temp;
					System.out.print(temp+",");
					k++;
					}
				}
				sum=0;
			}	
		}
		private static void anagram() {
			int l,k,c=0,i=1;
			int[] a=new int[1000];
			a[0]=2;
	        for(l=2;l<=1000;l++)
	        {
	               for(k=2;k<l;k++)
	               {
	                   if(l%k==0)
	                   {
	                       c=0;
	                       break;
	                   }
	                   else
	                   {
	                       c=1;
	                   		
	                   }
	               }
	               if(c==1)
	               {
	                   a[i]=l;
	                   i++;   
	               }
	         }
	        System.out.println();
	        System.out.println();
	        int[] e=new int[i];
	        e=a;
	        String str[]=new String[i];
	        for (int t = 0; t < i; t++)
	        {
				str[t] = String.valueOf(e[t]);
				
	        }
	        //Arrays.toString(str);
	        anagram1(str,i);
		}

		private static void anagram1(String[] str, int i) {
			int l,m;
			System.out.println("Anagram strings are");
			for(l=0;l<i;l++)
			{
				for(m=l+1;m<i;m++)
				{
					ana(str[l],str[m]);
				}
			}
		}

		private static void ana(String x, String y) {
			int i,j,c,d,g=0;
			char temp;
			char[] e = x.toCharArray();
		    char[] f = y.toCharArray();
		    c=e.length;
		    d=f.length;
		    if(c==d)
		    {
		        for(i=0;i<c-1;i++)
		        {
		            for(j=i+1;j<c;j++)
		            {  
		                if(e[i]>e[j])
		                {
		                    temp=e[i];
		                    e[i]=e[j];
		                    e[j]=temp;
		                }  
		            }
		        }
		        for(i=0;i<c-1;i++)
		        {
		            for(j=i+1;j<c;j++)
		            { 
		                if(f[i]>f[j])
		                {
		                    temp=f[i];
		                    f[i]=f[j];
		                    f[j]=temp;
		                }  
		            }
		        }
		        for(i=0;i<c;i++)
		        {
		            if(e[i]==f[i])
		            {
		                g++;
		            }
		        }
		        
		        
		        if(g==c)
		        {
		           System.out.print(x+":"+y+" , ");
		        }
		    
		    }
			

		}
	}



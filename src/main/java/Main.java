import java.util.Scanner;

public class recorsia {
	public static Scanner reader = new Scanner (System.in);
    	
  /* 1*/
   public static int a (int n) {
	   if(n==1) {
		   return 1;
	   }
	   return n+a(n-1);
   }
   
   /* 2*/
   public static int b (int n) {
	   if(n==1) {
		   return 1;
	   }
	   return n*b(n-1);
   }
    	
   /* 3*/
   public static int c (int n) {
	   if(n%2==1) {
	   
	   if(n==1) {
		   return 1;
	   }
		   return n*c(n-2);
	   }
	   else {
		 n=n-1;  
	   if(n==1) {
		   return 1;
	   }
		   return n*c(n-2);
	   }

   } 	
    	
   /* 4*/
   public static int d(int n) {
	   if(n<10) {
		   return 1;
   }
		  return 1+d(n/10);
	   }
   
   /* 5*/
   public static int e(int n,int p) {
	   if(n<p) {
		   return 0;
   }
		  return 1+e(n-p,p);
	   }
   
   /* 6*/
   public static int f(int n,int p) {
	   if(n<p) {
		   return n;
   }
		  return f(n-p,p);
	   }
   /* 7*/
   public static boolean g(int x, int y) {
       if (y == x) {
           return true;
       }
       if (x < y) {
           return false;
       }
       return g(x - y, y);
   }   

   /* לא הצלחתי לעשות את תרגילים 8,9*/

       
   public static void main(String[] args) {
System.out.println(a(3));	
System.out.println(b(4));	
System.out.println(c(7));	
System.out.println(d(712));	
System.out.println(e(10,5));	
System.out.println(f(10,6));	
System.out.println(g(10,5));	

    	
    	
    	
    }}

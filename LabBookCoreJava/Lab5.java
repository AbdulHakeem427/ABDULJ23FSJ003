package LabBookCoreJava;

import java.util.Scanner;

public class Lab5 {
	public static void main(String[] args) {
	calculateAverage();	
	}
	
	public static void calculateAverage() {
		
       int n,i ,num,sum=0;
       double avg;
       Scanner sn=new Scanner(System.in);
       
       System.out.println("enter no.of elements :");
       n=sn.nextInt();
       System.out.println("Enter "+n+" elements");
       for(i=1;i<=n;i++) {
    	   num= sn.nextInt();
    	   sum +=num;
       }
       avg=sum/n;
       System.out.println("Average o :"+avg);
	
	
	}
}

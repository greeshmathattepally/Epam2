package com.epam.maven_demo;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        ArrayList<Sweet> sweets=new ArrayList<Sweet>();
        ArrayList<Chocolate> chocolates=new ArrayList<Chocolate>();
        System.out.println("Enter total number of gifts presented");
        int n=sc.nextInt();
        while(n-->0)
        {
        	System.out.println("Enter 1 to present Sweet\n Enter 2 to present Chocolate");
        	int v=sc.nextInt();
        	if(v==1)
        	{
        		System.out.println("Enter name, weight and sweetness of sweet presented");
        		String name=sc.next();
        		int w=sc.nextInt();
        		int sw=sc.nextInt();
        		Sweet s1=new Sweet(name,w,sw);
        		sweets.add(s1);
        		//System.out.println(s1);
        	}
        	else
        	{
        		System.out.println("Enter name, weight and sweetness of chocolate presented");
        		String name=sc.next();
        		int w=sc.nextInt();
        		int sw=sc.nextInt();
        		chocolates.add(new Chocolate(name,w,sw));
        	}
        }
        //System.out.println(sweets);
        long totatWeight=0;
        for(int i=0;i<sweets.size();i++) 
        	totatWeight+=sweets.get(i).weight;
        	//System.out.print(sweets.get(i).name+" ");
        	
        System.out.println("Total Weight of all sweets prseented is"+totatWeight);
        Collections.sort(chocolates,new SweetnessComparator());
        System.out.println("Enter range of weights of chocolates to display");
        int left=0,right=-1;
        int min=sc.nextInt();
        int max=sc.nextInt();
        int l=0,h=chocolates.size()-1;
        while(l<=h)
        {
        	int m=(l+h)/2;
        	if(chocolates.get(m).weight>=min)
        	{
        		left=m;
        		h=m-1;
        	}
        	else l=m+1;
        }
        l=0;
        h=chocolates.size()-1;
        while(l<=h)
        {
        	int m=(l+h)/2;
        	if(chocolates.get(m).weight<=max)
        	{
        		right=m;
        		l=m+1;
        	}
        	else h=m-1;
        }
        System.out.println("Chocolates within given range are");
        for(int i=left;i<=right;i++)
        	System.out.print(chocolates.get(i).name);
        
    }
}

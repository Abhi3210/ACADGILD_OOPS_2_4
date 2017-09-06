import java.util.*;
import java.io.*;
public class Assignment4 {
	
    ArrayList<Integer> list=new ArrayList<Integer>();
    
    public int aliquot(int n){
    	int sum=0;
    	if(n>1){
    	for(int i=1;i<n;i++){
    		if(n%i==0){
    			sum+=i;
    		}
    	  }
    	return sum;
    	}
    	else
    	return sum;
    }
    public void perfectNumber(){
    	for(int i=1;i<=100;i++){
    		int n=aliquot(i);
    		if(n==i){
    			list.add(i);
    		}
    	}
    	for(Integer a:list){
    		System.out.println(a);
    	}
    }
    
    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number");
    	int n=sc.nextInt();
    	Assignment4 as=new Assignment4();
    	int aliquot_sum=as.aliquot(n);
    	System.out.println("Aliquot sum of "+n+" is:"+aliquot_sum);
    	System.out.println("The list of perfect number between 1 and 100 :");
    	as.perfectNumber();
    }
	
}

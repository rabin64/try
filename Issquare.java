package javaclass;
import java.util.Scanner;

public class Issquare {
	 public static void main(String[] args) {
		    Scanner s = new Scanner(System.in);
		     
		        
		      System.out.print("Enter number: ");
		     int n = s.nextInt();
		      
		      if(isSquare(n)){
		        System.out.print("Number is square");
		      }else{
		        System.out.print("Number is not square");
		      }
		  }
		  
		  static Boolean isSquare(int n)
		    {
		        for (int i = 0; i < n / 2 + 2; i++)
		        {
		            if (i * i == n)
		            {
		                return true;
		            }
		        }
		        return false;
		    }

}

import java.util.Scanner;
import java.lang.Math.*;
class PowerCalculation{
      public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the power of number:");
	  double a=sc.nextInt();
	  System.out.println("Enter the number:");
	  double b=sc.nextInt();
	  double c=Math.pow(b,a);
	  System.out.println("The power calculation of given two numbers is:"+c);
	  }
}
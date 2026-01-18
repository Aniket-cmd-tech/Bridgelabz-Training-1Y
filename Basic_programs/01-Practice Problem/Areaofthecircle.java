import java.util.Scanner;
import java.lang.Math.*;
class AreaofCircle{
    public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius of your desired circle in decimal format:");
	double radius=sc.nextDouble();
	double Area = Math.PI*Math.pow(radius,2);
	System.out.println("Area of Circle of given radius:"+Area);
	}
}
	
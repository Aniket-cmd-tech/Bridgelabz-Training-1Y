import java.util.Scanner;
class PerimeterofTheRectangle{
      public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the value of length:");
	  double length=sc.nextDouble();
	  System.out.println("Enter the value of width:");
	  double width=sc.nextDouble();
	  double Perimeter = 2 * (length + width);
	  System.out.println("Perimeter of the rectangle of given width and length is:"+Perimeter);
	  }
}
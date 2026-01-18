import java.util.Scanner;
class KmtoM{
      public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the distance in Km:");
	  double Km=sc.nextInt();
	  double M=Km*0.621371;
	  System.out.println("The distance in Miles is:"+M);
	  }
}
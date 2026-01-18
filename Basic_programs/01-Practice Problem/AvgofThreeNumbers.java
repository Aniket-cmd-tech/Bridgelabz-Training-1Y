import java.util.Scanner;
class AvgofThreeNumbers{
      public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the three numbers:");
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  int c=sc.nextInt();
	  int Avg=(a+b+c)/3;
	  System.out.println("The avg of three no.'s is:"+Avg);
	  }
}
	  
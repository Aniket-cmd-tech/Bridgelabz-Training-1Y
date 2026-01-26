import java.util.Scanner;
class DivisiblebyFive{
      public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  int number=sc.nextInt();
	  System.out.println("The number is divisible by 5?:"+(number%5==0?"Yes":"No"));
	  }
}
	  	  
import java.util.Scanner;
class tempconverter
{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the temperature in Celsius:");
  int Celsius=sc.nextInt();
  int Fahrenheit = (Celsius * 9/5) + 32;
  System.out.println("The temperature in Fahrenheit is:"+Fahrenheit);
  }
}
  
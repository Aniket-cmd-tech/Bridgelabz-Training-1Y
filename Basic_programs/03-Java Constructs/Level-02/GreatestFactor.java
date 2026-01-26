import java.util.Scanner;

class GreatestFactor{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        if(number>0){
            int greatestFactor=1;
            for(int i=number-1;i>=1;i--){
                if(number%i==0){
                    greatestFactor=i;
                    break;
                }
            }
            System.out.println(greatestFactor);
        }else{
            System.out.println("The number "+number+" is not a positive integer");
        }
    }
}

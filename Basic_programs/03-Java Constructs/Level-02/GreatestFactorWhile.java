import java.util.Scanner;

class GreatestFactorWhile{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number>0){
            int greatestFactor=1;
            int counter=number-1;
            while(counter>=1){
                if(number%counter==0){
                    greatestFactor=counter;
                    break;
                }
                counter--;
            }
            System.out.println(greatestFactor);
        }else{
            System.out.println("The number "+number+" is not a positive integer");
        }
    }
}

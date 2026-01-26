import java.util.Scanner;

class FriendsCompare{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int amarAge=sc.nextInt();
        int akbarAge=sc.nextInt();
        int anthonyAge=sc.nextInt();
        double amarHeight=sc.nextDouble();
        double akbarHeight=sc.nextDouble();
        double anthonyHeight=sc.nextDouble();
        int youngestAge=amarAge;
        String youngest="Amar";
        if(akbarAge<youngestAge){
            youngestAge=akbarAge;
            youngest="Akbar";
        }
        if(anthonyAge<youngestAge){
            youngestAge=anthonyAge;
            youngest="Anthony";
        }
       double tallestHeight=amarHeight;
        String tallest="Amar";
        if(akbarHeight>tallestHeight){
            tallestHeight=akbarHeight;
            tallest="Akbar";
        }
        if(anthonyHeight>tallestHeight){
            tallestHeight=anthonyHeight;
            tallest="Anthony";
        }
        System.out.println("Youngest friend is "+youngest);
        System.out.println("Tallest friend is "+tallest);
    }
}

import java.util.Scanner;
public class fev{
    public static void main(String[] args){
        int x;
        Scanner read=new Scanner(System.in);
        x=read.nextInt();
        if(x<3){
            System.out.println("LIGHT");
        }
        else if(x>=7){
            System.out.println("HEAVY");
        }
        else{
            System.out.println("MODERATE");
        }
    }
}
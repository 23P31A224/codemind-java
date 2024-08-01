import java.util.Scanner;
public class rp{
    public static void main(String[] args){
        int a;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        
        double b=a/3.6;
        System.out.printf("%.2f",b);
    }
}
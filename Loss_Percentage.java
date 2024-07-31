import java.util.Scanner;
public class lp{
    public static void main(String[] args){
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        double x=(a-b)/10.0;
        double res=(x*1000)/a;
        System.out.printf("%.2f%n",res);
    }
}
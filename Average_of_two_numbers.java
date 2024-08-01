import java.util.Scanner;
public class rp{
    public static void main(String[] args){
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        double c=(a+b)/2.0;
        System.out.printf("Average of %d and %d is: %.2f",a,b,c);;
    }
}
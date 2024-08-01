import java.util.Scanner;
public class km{
    public static void main(String[] args){
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        double c=a/3.6;
        System.out.printf("%.2f",c);
    }
}
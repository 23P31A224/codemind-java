import java.util.Scanner;
public class pp{
    public static void main(String[] args){
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        double pp=(-(a-b)/10.0);
        double res=(pp*1000)/a;
        System.out.printf("%.2f",res);
    }
}
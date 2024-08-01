import java.util.Scanner;
public class vs{
    public static void main(String[] args){
        int r;
        Scanner read=new Scanner(System.in);
        r=read.nextInt();
        double res=(4.0/3.0)*3.14*(r*r*r);
        System.out.printf("%.2f",res);
    }
}
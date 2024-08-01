import java.util.Scanner;
public class ic{
    public static void main(String[] args){
        int a;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        double c=a*2.54;
        System.out.printf("%.2f",c);
    }
}
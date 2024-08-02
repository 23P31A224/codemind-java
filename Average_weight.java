import java.util.Scanner;
public class aw{
    public static void main(String[] args){
        int a,b1,b2;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b1=read.nextInt();
        b2=read.nextInt();
        int b3=3*a-b1-b2;
        System.out.println(b3);
    }
}
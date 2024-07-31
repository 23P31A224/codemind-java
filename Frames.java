import java.util.Scanner;
public class frames{
public static void main(String[] args){
    int a,b,c;
    Scanner read =new Scanner(System.in);
    a=read.nextInt();
    b=read.nextInt();
    c=read.nextInt();
    int x = 2*(a+b);
    int res = x*c;
    System.out.println(res);
    }
}
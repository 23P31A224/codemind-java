import java.util.Scanner;
public class water{
    public static void main(String[] args){
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        int res = (a*b)/(a+b);
        System.out.println(res);
    }
    
}
import java.util.Scanner;
public class cap{
    public static void main(String[] args){
        int a,b,c;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        c=read.nextInt();
        int res=(a*b*c);
        System.out.printf("%d KB",res);
    }
}
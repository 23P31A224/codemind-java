import java.util.Scanner;
public class bridge{
    public static void main(String[] args){
        int a,b,c;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        c=read.nextInt();
        int res=(c-b)/a;
        System.out.println(res);
    }
}
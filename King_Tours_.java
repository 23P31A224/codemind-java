import java.util.Scanner;
public class king{
    public static void main(String[] args){
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        int res=(a*5)+(b*7);
        System.out.println(res);
    }
}
import java.util.Scanner;
public class sfld{
    public static void main(String[] args){
        int n,a;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        a=n%10;
        while(n>9){
            n=n/10;
        }
        System.out.println(a+n);
    }
}
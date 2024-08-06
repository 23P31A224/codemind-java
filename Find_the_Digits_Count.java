import java.util.Scanner;
public class sfld{
    public static void main(String[] args){
        int n,dc=0,r;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        while(n!=0){
            r=n%10;
            dc=dc+1;
            n=n/10;
        }
        System.out.printf("%d",dc);
    }
}
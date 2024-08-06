import java.util.Scanner;
public class sfld{
    public static void main(String[] args){
        int n,sum=0,r;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        while(n!=0){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println(sum);
    }
}
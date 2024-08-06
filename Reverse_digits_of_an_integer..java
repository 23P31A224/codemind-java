import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
        int n;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        int i,rev=0;
       while(n!=0){
           int r=n%10;
           rev=rev*10+r;
           n=n/10;
       }
            System.out.printf("%d",rev);
        
    }
}
import java.util.Scanner;
public class ap{
    public static void main(String[] args){
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        int sum=a+b;
        int dif=a-b;
        int mul=a*b;
        int div=a/b;
        int rem=a%b;
        System.out.printf("Sum:%d
",sum);
         System.out.printf("Difference:%d
",dif);
          System.out.printf("Product:%d
",mul);
           System.out.printf("Quotient:%d
",div);
            System.out.printf("Remainder:%d
",rem);
    }
}
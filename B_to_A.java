import java.util.Scanner;

public class sumoffirstNnaaturalnumbers{
    public static void main(String[] args){
        int a,b;
        Scanner read=new Scanner(System.in);
            a=read.nextInt();
            b=read.nextInt();
            int i;
            for(i=b;i>=a;i--){
            System.out.printf("%d ",i);
            }
        }
    }

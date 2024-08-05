import java.util.Scanner;
public class dbtp{
    public static void main(String[] args){
    int x1,x2,y1,y2;
    Scanner read=new Scanner(System.in);
    x1=read.nextInt();
    y1=read.nextInt();
    x2=read.nextInt();
    y2=read.nextInt();
    float a=x2-x1;
    float b=y2-y1;
    double res=Math.sqrt((a*a)+(b*b));
    System.out.printf("%.4f
",res);
   }
}
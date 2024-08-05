import java.util.Scanner;
public class height{
    public static void main(String[] args){
        int a,b;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
}
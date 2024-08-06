import java.util.Scanner;
public class vote{
    public static void main(String[] args){
        int n;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        if(n>=18){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
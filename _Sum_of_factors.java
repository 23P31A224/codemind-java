import java.util.Scanner;
public class prime{
    public static void main(String[] args){
        int n;
        Scanner read=new Scanner(System.in);
        n=read.nextInt();
        int i,fact=0;
        for(i=1;i<n;i++){
            if(n%i==0){
                fact=fact+i;
            }
        }
            System.out.printf("%d
",fact);
        
    }
}
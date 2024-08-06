import java.util.Scanner;

public class factor{
    public static void main(String[] args){
        int n;
        Scanner read=new Scanner(System.in);
            n=read.nextInt();
            int i=1,sum=0;
            while(i<=n){
                if((n%i)==0){
                    System.out.printf("%d ",i);
                    sum=sum+i;
                }
                i++;
            }
        }
    }

import java.util.Scanner;

public class sumoffirstNnaaturalnumbers{
    public static void main(String[] args){
        int n;
        Scanner read=new Scanner(System.in);
            n=read.nextInt();
            int i=1,sum=0;
            while(i<=n){
                
                    sum=sum+i;
                i++;
            }
             System.out.printf("%d ",sum);
        }
    }

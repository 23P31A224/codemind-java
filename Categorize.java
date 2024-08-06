import java.util.Scanner;
public class cat{
    public static void main(String[] args){
        float n;
        Scanner read=new Scanner(System.in);
        n=read.nextFloat();
        if(150>n){
            System.out.println("Person is Dwarf.");
        }
        else if(n>150 && 165>=n){
            System.out.println("Person is average heighted.");
        }
        else if(n>165 && 195>=n){
            System.out.println("Person is taller.");
        }
        else{
            System.out.println("Abnormal height.");
        }
    }
}
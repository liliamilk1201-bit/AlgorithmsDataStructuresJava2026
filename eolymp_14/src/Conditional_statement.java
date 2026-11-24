import java.util.Scanner;

public class Conditional_statement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // example below, replace it with your solution
        int x = in.nextInt();
        int y;
        if (x<5){
            y=x*x-3*x+4;
        }
        else{
            y=x+7;
        }
        System.out.println(y);
    }
}
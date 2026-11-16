import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        // example below, replace it with your solution
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(in.hasNextInt()){
            int n = in.nextInt();
            int m = in.nextInt();
            sb.append(2*(n+m)).append(" ").append(n*m).append("\n");
        }
        System.out.println(sb);
    }
}

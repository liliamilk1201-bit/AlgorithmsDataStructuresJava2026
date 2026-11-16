import java.util.Scanner;

public class Print_array {
    public static void main(String[] args) {
        // example below, replace it with your solution
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        for(int i=n-1; i>=0; i--){
            sb.append(a[i]);
            if(i>0){
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}

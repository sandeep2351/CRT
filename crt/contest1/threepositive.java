import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        if(n1 != 7 && n2 != 7 && n3 != 7) {
            System.out.print(n1 * n2 * n3);
        }
        
        if(n3 == 7) {
            System.out.print(-1);
        }
        
        if(n2 == 7) {
            System.out.print(n3);
        }
        
        if(n1 == 7) {
            System.out.print(n2 * n3);
        }
    }
}
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[200];
        int i = 0;
        while (i < 200) {
            if (n % 100 != 0) {
                if (n % 4 == 0) {
                    arr[i] = n;
                    i++;
                }
                n++;
            } else {
                if (n % 100 == 0 && n % 400 == 0) {
                    arr[i] = n;
                    i++;
                }
                 n++;
            }
        }
        for (int j = 0; j < 15 && j < arr.length; j++) {
            if (j > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[j]);
        }
    }
}

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int n;
        while (sc.hasNext()) {
            n = sc.nextInt();
            if (n == -1) {
                break;
            }
            if (n < min) {
                min = n;
            }
        }
        System.out.println("Thank you! " + min + " is the smallest number.");
    }
}

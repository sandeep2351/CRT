import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner(System.in);
        int total = 0;
        int n;
        while ((n = sc.nextInt()) != -1) {
            total += n;
        }
        System.out.println(total);
    }
    
}
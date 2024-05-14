import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String food_type=sc.next();
        int no_of_plates=sc.nextInt();
        int kilometers=sc.nextInt();
        int bill=0;
        int cost=0;
        if(food_type.equals("V") || food_type.equals("N") && kilometers > 0 && no_of_plates >0)
        {
            if(food_type.equals("V"))
            {
                bill = 120 * no_of_plates;
            }
            else{
                bill= 150 * no_of_plates;
            }
        if(kilometers >3)
        {
            if(kilometers <= 6){
                cost=(kilometers - 3)*3;
            }
            else
            {
                cost=9+(kilometers-6)*6;
            }
        }
        else
        {
             cost =0;
        }
        System.out.println(bill+cost);
        }
        else
        {
            System.out.println(-1);
        }
    }
}
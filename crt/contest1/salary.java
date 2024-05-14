import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int current_salary=sc.nextInt();
        int job_level=sc.nextInt();
        if(job_level == 3)
        {
            int hike_amount= current_salary*15/100;
            int result=current_salary+hike_amount;
            System.out.println(result);
        }
        else if(job_level == 4)
        {
            int hike_amount= current_salary*7/100;
            int result=current_salary+hike_amount;
            System.out.println(result);
        }
         else if(job_level == 5)
        {
            int hike_amount= current_salary*5/100;
            int result=current_salary+hike_amount;
            System.out.println(result);
        }
        else
        {
            System.out.println("0");
        }
        
    }
}
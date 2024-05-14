import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int x= sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            int item_cost=z/5;
        if(item_cost <= y)
        {
          int one_coin= z-(5*item_cost);
            if(one_coin<= x)
            {
                System.out.println(one_coin);
                System.out.println(item_cost);
            }
            else
            {
               System.out.println(-1); 
            }
        }
        else
        {
          int one_coin= z-(5*y);
            if(one_coin <= x)
            {
                System.out.println(one_coin);
                System.out.println(y);
            }
            else
            {
               System.out.println(-1); 
            }  
            
        }
            
    }
}
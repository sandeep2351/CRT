import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int current_currency=sc.nextInt();
        sc.nextLine();
        String country_currency=sc.nextLine(); // Read the currency name
        
        if(country_currency.equals("Euro")) {
            double total_amount=0.01417*current_currency;
            System.out.println(total_amount);
        }
        else if(country_currency.equals("British Pound")) {
            double total_amount=0.0100*current_currency;
            System.out.println(total_amount);
        }
        else if(country_currency.equals("Australian Dollar")) {
            double total_amount=0.02140*current_currency;
            System.out.println(total_amount);
        }
        else if(country_currency.equals("Canadian Dollar")) {
            double total_amount=0.02027*current_currency;
            System.out.println(total_amount);
        }
        else {
            System.out.println("Invalid currency name");
        }   
    }
}
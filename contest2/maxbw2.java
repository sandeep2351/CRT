import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int res=-1;
        if(num2>99){
            num2=99;
        }
        for(int i=num1;i<=num2;i++){
            if(i%5==0 && (i>9 && i<100)){
                if(Multiple(i)){
                    res=Math.max(i,res);
                }
            }
        }
        System.out.println(res);
    }
    public static boolean Multiple(int num){
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            num/=10;
        }
        return sum%3==0;
    }
}
package assignment1;

import java.util.Scanner;

public class TenthProblem {
    public static void main(String[] arg){
        double startTime = System.nanoTime();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println("Time taken " + duration + " milliseconds");
        int a = gcd(n,k);
        System.out.println(a);
    }
    /*
     *This method returns gcd of 2 numbers that we inputed.
     *Time complexity: (O(log(min(n, k)))), where n and k is numbers that we input.
     *Complexity class: logarithmic
     *@param n,k The is numbers that we input.
     *@return n: if they are equal to each other.
     *@return n,k: if n or k equal to zero. n or k is a last gcd number that we saved.
     *@return gcd(n,k) is a recursion
     */
    public static int gcd(int n, int k){
        if(n == k){
            return n;
        }
        else if(n > k){
            int f = n%k;
            n = k;
            k = f;
            if(n == 0 || k==0){
                return n;
            }
            return gcd(n,k);
        }
        else{
            int f = k%n;
            k = n;
            n = f;
            if(n == 0 || k==0){
                return k;
            }
            return gcd(n,k);
        }
    }
}

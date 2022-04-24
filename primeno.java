package src;

import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        newprime(n);
        
    }

    private static void newprime(int n) {
        boolean isprime = true;
        if(n==0 || n==1){
            isprime = false;
        }
        int i = 2;
        for ( ; i <= n; i++) {
            if(n%i == 0){
                isprime = false;
                break;
            }
           
        }

        if(isprime == true){
            System.out.println(n + "is a prime number");
        }
        else{
            System.out.println("not prime");
        }
    }

    public static void prime(int n) {
        
        
    }
}

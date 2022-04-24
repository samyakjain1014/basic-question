package src;

public class noofdigits {
    public static void main(String[] args) {
        //this tells how much value's are there in a base of any number
        // below example represents that 10 in binary has 4 digits
        int n = 10;
        int b = 2;
        int ans = (int) (Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
    }

}

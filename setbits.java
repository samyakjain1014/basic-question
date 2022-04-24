package src;

public class setbits {
        public static void main(String[] args) {
            int n = 22;
            System.out.println(Integer.toBinaryString(n));

            System.out.println(bit(n));
        }

        private static int bit(int n){
            int count = 0;
             
            // while(n>0){
            //     count++;
            //     n -= (n & -n);
            // }

            while(n>0){
                count++;
                n = n & (n-1);
            }
            return count;
        }
}

public class Reverse {
    public static void main(String[] args) {
        
        int num = 1234567, reversed = 0;

        System.out.println("Original Number String: " + num);
        
        for(;num != 0; num /= 10) {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        }
    
        System.out.println("\nReversed Number String: " + reversed);
    }
}

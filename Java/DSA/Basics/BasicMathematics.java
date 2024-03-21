class BasicMathematics{
    public static void main(String[] args) {

        countDigits(300);
        reverseNumber(146);
    }


    /**
     * @param num : to count the number of digits in num
     *
     *  There are multiple ways to do this :
     *            - using string
     *            - using loops
     *            - using logarithm
     */
    static void countDigits(int num){

        int digitCount = 0;

        // using strings
        digitCount = String.valueOf(num).length();
        System.out.println("Using String: "+digitCount);

        // using loops
        digitCount = 0;
        int n = num;
        if(n == 0){
            digitCount++;
        }
        while(n>0){
            n = n/10;
            digitCount++;
        }
        System.out.println("Using Loop: "+digitCount);

        //using logs
        digitCount = 0;
        digitCount = (int) Math.floor(Math.log10(Math.abs(num))) + 1;
        System.out.println("Using Logarithm: "+digitCount);

    }

    /**
     * @param num : number to be reversed
     *
     *  We can solve this by multiple approaches mentioned below
     *            - using while loop
     *            - using for loop
     *            - using recursion
     *            - using string conversion
     */
    static void reverseNumber(int n){
        int num = n;
        int reversed = 0;

        // using while loop
        while(num != 0){
            reversed = reversed * 10 + num%10;
            num /= 10;
        }
        System.out.println("Reversed (while loop): "+reversed);

        // using for loop
        reversed = 0;
        num = n;
        for(int i=num;i!=0;i/=10){
            reversed = reversed * 10 + i%10;
        }
        System.out.println("Reversed (for loop): "+ reversed);

        // using recursion
        num = n;
        reversed = reverseNumberRecursive(num);
        System.out.println("Reversed (recursion): "+reversed);

        // using string conversion
        reversed = 0;
        StringBuilder reversedString = new StringBuilder(String.valueOf(num)).reverse();
        reversed = Integer.parseInt(String.valueOf(reversedString));
        System.out.println("Reversed (string conversion): "+reversed);
    }

    /**
     * @param num the number to be reversed
     * @return the reversed number
     *
     *just it would have been easy to understand if there was a calculation on pen paper. for now just remember, log base 10 of number means how many times 10 will have to multiply itself to reach that number. so log10(30) = 1.46 approx. this means that 10^1.46 = 30 (Don't take this seriously maths does not really love to work with decimal values as power)
     */
    private static int reverseNumberRecursive(int num) {
        if (num == 0) {
            return 0;
        }
        int reversedRest = reverseNumberRecursive(num / 10);
        int digit = num % 10;
        int numDigits = (int) Math.log10(Math.abs(num)) + 1;  // Calculate digits efficiently
        return digit * (int) Math.pow(10, numDigits - 1) + reversedRest;  // Correct order and multiplication
    }

}